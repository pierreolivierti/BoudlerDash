package model;

public class Mobile implements IElement {
	private int posX;
	private int posY;
	
	public Mobile(Position position, MapArray map) {
		this.posX = position.getX();
		this.posY = position.getY();
		
		while(map.getType(posX, posY) == "Background" || map.getType(posX, posY) == "Stone" || map.getType(posX, posY) == "Diamond") {
			if (map.getType(posX, posY++) == "Background") {
				this.fallDown(position, map);
			}
			else if(map.getType(posX, posY++) == "Stone" || map.getType(posX, posY++) == "Diamond") {
				this.verticalFall(position, map);
			}
		}
	}
	
	public void verticalFall(Position position, MapArray map) {
		
	}
	
	public void fallDown(Position position, MapArray map) {
		
	}
	
	public void fallRight(Position position, MapArray map) {
		
	}
	
	public void fallLeft(Position position, MapArray map) {
		
	}
	
	public void fallRandom(Position position, MapArray map) {
		
	}

	@Override
	public void applyGravity(Position position, BoulderDashElement element) {
		// TODO Auto-generated method stub
		
	}
}
