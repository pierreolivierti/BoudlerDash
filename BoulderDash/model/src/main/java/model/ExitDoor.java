package model;

import model.dao.Map;

public class ExitDoor extends BoulderDashElement {
	private static int imgPosX = 13;
	private static int imgPosY = 1;
	private boolean isOpen = false;
	private static int nbDiamond = 0;
	public static boolean win;
	private Position position;
	
	public ExitDoor(Position position) {
		super(position, imgPosX, imgPosY);
		this.position = position;
	}
	
	public void state(Map map) {
		if(map.getCountDiamond() == Player.getCollectDiamond()) {
			isOpen = true;
		}
	}
	
	public void win(Position positon, MapArray map) {
		if(map.getType(this.position.getX(), this.getPosition().getY()) == "Player" && isOpen == true) {
			// WIN
		}
	}
	
	public void gravity(Position position, MapArray map) {
		this.gravity = new NoGravity();
	}
	
	public static int getCollectedDiamond() {
		return nbDiamond;
	}
	
	public static void setCollectedDiamond() {
		nbDiamond++;
	}
	
	public static boolean getIsOpen() {
		return open;
	}
	
	public static boolean getWin() {
		return win;
	}
	
	public static void setWin(boolean isWinner) {
		win = isWinner;
	}
}
