package model;

import java.awt.Image;

public interface IMobile {
	public Direction getDirection();
	public void setDirection(Direction direction);
	public Dimension getDimension();
	public Position getPosition();
	public int getWidth();
	public int getHeight();
	public int getSpeed();
	public Image getImage();
	public void move();
	public void placeInArea(IArea area);
	public void setModel(ModelFacade model);
}
