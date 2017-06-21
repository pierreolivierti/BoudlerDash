package view;

import java.awt.event.KeyEvent;

import controller.IControllerFacade;
import controller.Order;
import controller.UserOrder;

public class EventPerformer implements IEventperformer{

	public EventPerformer(IControllerFacade orderPerformer){
		this.orderPerformer = orderPerformer;
	} 
	
	public void eventPerform(KeyEvent keyCode){
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode){
		
	}
}
