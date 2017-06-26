package view;

import java.awt.event.KeyEvent;

import model.IOrderPerformer;
import model.Order;

public class EventPerformer implements IEventPerformer{
	private IOrderPerformer orderPerformer;

	public EventPerformer(IOrderPerformer orderPerformer){
		this.orderPerformer = orderPerformer;
	} 
	
	public void eventPerform(KeyEvent keyCode){
		final UserOrder userOrder = this.keyCodeToUserOrder(keyCode.getKeyCode());
		if (userOrder != null) {
			this.orderPerformer.orderPerform(userOrder);
		}
	}
		
	private UserOrder keyCodeToUserOrder(int keyCode){
		UserOrder userOrder;
		switch (keyCode) {
		case KeyEvent.VK_UP:
			userOrder = new UserOrder(Order.UP);
			break;
		case KeyEvent.VK_RIGHT:
			userOrder = new UserOrder(Order.RIGHT);
			break;
		case KeyEvent.VK_DOWN:
			userOrder = new UserOrder(Order.DOWN);
			break;
		case KeyEvent.VK_LEFT:
			userOrder = new UserOrder(Order.LEFT);
			break;
		default:
			userOrder = null;
		}
		return userOrder;
	}
}