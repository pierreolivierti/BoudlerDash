package view;

import model.IUserOrder;
import model.Order; 

public class UserOrder implements IUserOrder{
	private final Order order;
	
	public UserOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public Order getOrder() {
		return this.order;
	}
}
