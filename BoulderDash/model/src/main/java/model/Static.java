package model;

public class Static implements IElement {
	private Position position;
	private String image;
	private IModelFacade model;
	
	public Static(Position position, int imgPositionX, int imgPositionY) {
		this.position = position;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public void placeInArea() {
		
	}
	
	public IModelFacade getModel(){
		return this.model;
	}
	
	public void setModel(IModelFacade model) {
		this.model = model;
	}
	
	public String getImage() {
		return this.image;
	}
}
