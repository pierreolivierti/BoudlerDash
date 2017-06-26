package model;

public class Mud extends BoulderDashElement {
	private static int imgPosX = 13;
	private static int imgPosY = 1;
	private int x;
	private int y;
	
	public Mud(Position position) {
		super(position, imgPosX, imgPosY);
		x = position.getX();
		y = position.getY();
	}
	
	public void dig(Position postion, MapArray map) {
		if(map.getType(x,y) == "Player") {
			while(map.getType(x,y) == "Player") {
				
			}
			map.setType(x,y, '0');
		}
	}
	
	public void gravity(Position position, MapArray map) {
		
	}
	
}
