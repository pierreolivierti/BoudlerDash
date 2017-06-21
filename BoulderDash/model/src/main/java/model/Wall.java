package model;

public class Wall extends Static {
	private Position position;
	private Dimension dimension;
	private static String image = "wall.jpg";
	
	public Wall(Position position, Dimension dimension) {
		super(position, dimension, image);
		this.position = position;
		this.dimension = dimension;
	}
	
	public boolean isBorder() {
		////////////////////////////
		// Check behavior //////////
		// if isBorder return true /
		// else return false ///////
		////////////////////////////
		return false;
	}
}
