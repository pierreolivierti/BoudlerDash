<<<<<<< HEAD
package model;

public class Mobile implements IMobile {
	private final int WIDTH = 16;
	private final int HEIGHT = 16;
	private Dimension dimension;
	private Direction direction;
	private IModelFacade model;
	private String image;
	private int speed;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		
	}
	
	public Direction getDirection() {
		return this.direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Position getPosition() {
		return null;
	}
	
	public Dimension getDimension() {
		return this.dimension;
	}
	
	public int getWidth() {
		return this.WIDTH;
	}
	
	public int getHeight() {
		return this.HEIGHT;
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
=======
package model;

import java.awt.Color;
import java.awt.Image;

import model.Dimension;
import model.Position;

public class Mobile implements IMobile {
	private final int WIDTH = 16;
	private final int HEIGHT = 16;
	private Dimension dimension;
	private Direction direction;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		
	}
	
	public Direction getDirection() {
		return null;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Position getPosition() {
		return null;
	}
	
	public Dimension getDimension() {
		return this.dimension;
	}
	
	public int getWidth() {
		return this.WIDTH;
	}
	
	public int getHeight() {
		return this.HEIGHT;
	}
	
	public int getSpeed() {
		return 0;
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
	public Model getModel() {
		return null;
	}
	
	public void setModel(IModelFacade model) {
		
	}
	
	public Image getImage() {
		return null;
	}
}
>>>>>>> origin/master
