package model;

public class Dimension {
	private int width;
	private int height;
	private Dimension dimension;
	
	public Dimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	public Dimension(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}
