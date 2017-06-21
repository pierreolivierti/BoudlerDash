package model;

public class Mud extends Static{
	private Position position;
	private Dimension dimension;
	private static String image = "mud.jpg";
	
	public Mud(Position position, Dimension dimension) {
		super(position, dimension, image);
		this.position = position;
		this.dimension = dimension;
	}
	
	
}
