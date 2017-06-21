package model;

public class Position {
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	private Position position;
	
	public Position(double x, double y, double maxX, double maxY) {
		this.x = x;
		this.y = y;
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	public Position(Position position) {
		this.position = position;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getMaxX() {
		return this.maxX;
	}
	
	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	
	public double getMaxY() {
		return this.maxY;
	}
	
	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}
}
