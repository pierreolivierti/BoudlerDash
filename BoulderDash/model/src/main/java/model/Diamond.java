package model;

public class Diamond extends BoulderDashElement implements IGravity {
	private static int imgPosX = 10;
	private static int imgPosY = 0;
	private boolean isCollected = false;
	
	public Diamond(Position position) {
		super(position, imgPosX, imgPosY);
	}
	
	public void move() {

	}

	public void gravity(Position position, MapArray array) {
		if(isCollected) {
			//gravity
		}
	}
	
	public void setCollectedDiamond() {
		
	}
}
