package model;

public class ExitDoor extends Static {
	private static int imgPosX = 13;
	private static int imgPosY = 1;
	private boolean isOpen = false;
	private static String image = "exitdoor.jpg";
	
	public ExitDoor(Position position) {
		super(position, imgPosX, imgPosY);
	}
	
	public void state(Map map1) {
		if(map1.getCountDiamond() == Player.collectDiamond()) {
			open = true;
			
		}
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
