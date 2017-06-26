package model;

import java.util.Random;

public class Gravity implements IGravity {
	private int posX;
	private int posY;
	
	public void gravity(Position position, MapArray map) {
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
		if(map.getType(posX++, posY++) == "Background" && map.getType(posX++, posY)=="Background") {
			this.fallRight(position, map);
		} else if(map.getType(posX--, posY++)=="Background" && map.getType(posX++, posY)=="Background") {
			this.fallLeft(position, map);
		} else if(map.getType(posX--, posY++)=="Background" && map.getType(posX--, posY)=="Background" && map.getType(posX++, posY++) =="Empty" && map.getType(posX++, posY)=="Background") {
			this.fallRandom(position, map);
		} else if(map.getType(posX--, posY) != "Background" && map.getType(posX++, posY)!="Background") {
			return;
		}
	}
	
	public void fallDown(Position position, MapArray map) {
		position.setX(posY++);
	}
	
	public void fallRight(Position position, MapArray map) {
		position.setX(posX++);
	}
	
	public void fallLeft(Position position, MapArray map) {
		position.setX(posX--);
	}
	
	public void fallRandom(Position position, MapArray map) {
		Random rand =new Random();
		boolean left = rand.nextBoolean();
		if (left == true) {
			this.fallLeft(position, map);
		}
		else {
			this.fallRight(position, map);
		}
	}
}
