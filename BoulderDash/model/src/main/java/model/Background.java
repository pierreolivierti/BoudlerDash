package model;

public class Background extends BoulderDashElement {
	private static int imgPosX = 13;
	private static int imgPosY = 1;
	
	public Background(Position position) {
		super(position, imgPosX, imgPosY);
	}
	
	public void gravity(Position position, MapArray array) {

	}
	
	public void move(Position position, MapArray array, Direction direction) {

	}
}
