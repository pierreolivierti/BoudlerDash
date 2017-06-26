package model;

public class Wall extends BoulderDashElement implements IGravity {
	private static int imgPosX = 13;
	private static int imgPosY = 1;
	
	public Wall(Position position) {
		super(position, imgPosX, imgPosY);
	}

	@Override
	public void gravity(Position position, MapArray array) {
		// TODO Auto-generated method stub
		
	}
}
