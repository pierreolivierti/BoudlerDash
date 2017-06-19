package controller;

import controller.Order; 

public class UserOrder {
	private final Order order;
	
	public UserOrder(Order order) {
		this.order = order;
	}
	
	public Order getOrder() {
		System.out.println("Hello");
		return this.order;
	}
}
