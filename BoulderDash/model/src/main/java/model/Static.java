package model;

public class Static implements IElement {
	private Position position;
	private Dimension dimension;
	private String image;
	private IModelFacade model;
	
	public Static(Position position, Dimension dimension, String image) {
		this.position = position;
		this.dimension = dimension;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public Dimension getDimension() {
		return this.dimension;
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
