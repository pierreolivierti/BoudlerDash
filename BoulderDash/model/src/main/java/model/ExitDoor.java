package model;

public class ExitDoor extends Static{
	private Position position;
	private Dimension dimension;
	private boolean isOpen = false;
	private static String image = "exitdoor.jpg";
	
	public ExitDoor(Position position, Dimension dimension) {
		super(position, dimension, image);
		this.position = position;
		this.dimension = dimension;
	}
	
	public boolean isOpen() {
		/////////////////////////////////////////
		// Check if all diamonds are collected //
		// if OK return true ////////////////////
		// else return false ////////////////////
		/////////////////////////////////////////
		return false;
	}
}
