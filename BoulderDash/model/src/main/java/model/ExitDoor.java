package model;

public class ExitDoor extends Static {
	private static int imgPosX = 13;
	private static int imgPosY = 1;
	private boolean isOpen = false;
	
	public ExitDoor(Position position) {
		super(position, imgPosX, imgPosY);
	}
	
	public void state(Map map1) {
		if(map1.getCountDiamond() == Player.collectDiamond()) {
			isOpen = true;
			
		}
	}
	
	public void win(Position positon, MapArray map) {
		if(map.getType(this.position.getX(), this.getPosition().getY()) == "Player" && isOpen == true) {
			System.exit(0);
		}
	}
}
