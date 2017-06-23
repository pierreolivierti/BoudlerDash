package model;

public class Mobile implements IElement {
	private Dimension dimension;
	private Direction direction;
	private IModelFacade model;
	private String image;
	private Position position;
	private int speed;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.direction = direction;
		this.position = position;
		this.dimension = dimension;
		this.speed = speed;
		this.image = image;
	}
	
	public Direction getDirection() {
		return this.direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public Dimension getDimension() {
		return this.dimension;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void move() {
		
	}
	
	public void placeInArea(IArea area) {
		
	}
	
	public void moveUp() {
		
	}

	public void moveDown() {
		
	}
	
	public void moveRight() {
		
	}
	
	public void moveLeft() {
		
	}
	public IModelFacade getModel() {
		return this.model;
	}
	
	public void setModel(IModelFacade model) {
		this.model = model;
	}
	
	public String getImage() {
		return this.image;
	}
}
