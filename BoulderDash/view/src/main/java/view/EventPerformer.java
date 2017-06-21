package view;

import java.awt.event.KeyEvent;

import controller.IController;
import controller.Order;
import controller.UserOrder;

public class EventPerformer implements IEventperformer{
	private IController orderPerformer;

	public EventPerformer(IController orderPerformer){
		this.orderPerformer = orderPerformer;
	} 
	
	public void eventPerform(KeyEvent keyCode){
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode){
		
	}
}
