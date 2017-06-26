package model;

public class Stone extends BoulderDashElement implements IGravity {
	private static int imgPosX = 13;
	private static int imgPosY = 1;
	private Position position;
	
	public Stone(Position position) { 
		super(position, imgPosX, imgPosY);
		this.position = position;
	}
	
	public void move() {
		this.position.setY(this.position.getY()-1);
	}

	@Override
	public void gravity(Position position, MapArray array) {
		// TODO Auto-generated method stub
		
	}
	
}
