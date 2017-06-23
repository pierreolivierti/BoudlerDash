package model;

public class Position {
	private int x;
	private int y;
	private int maxX = 1;
	private int maxY = 1;
	private Position position;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Position(Position position) {
		this.position = position;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double getMaxX() {
		return this.maxX;
	}
	
	protected void setMaxX(int maxX) {
		this.maxX = maxX;
	}
	
	public double getMaxY() {
		return this.maxY;
	}
	
	protected void setMaxY(int maxY) {
		this.maxY = maxY;
	}
}
