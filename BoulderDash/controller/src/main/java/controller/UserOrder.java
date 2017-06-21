package controller;

import controller.Order; 

public class UserOrder implements IUserOrder{
	private final Order order;
	
	public UserOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public Order getOrder() {
		System.out.println("Hello");
		return this.order;
	}
}
//commit1