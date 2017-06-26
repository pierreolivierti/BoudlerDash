package model;

public class Enemy extends BoulderDashElement {
	private static int imgPosX = 16;
	private static int imgPosY = 1;
	private int x;
	private int y;
	private boolean isDead;
	
	public Enemy(Position position, MapArray map) {
		super(position, imgPosX, imgPosY);
		this.map = map;
	}
	
	public void getDiamond(MapArray map) {
		if(map.getType(x,  y--) == "Player" || map.getType(x,  y++) == "Player" || map.getType(x--, y) == "Player"
				|| map.getType(x++, y) == "Player" || map.getType(x, y--) == "Rock" || map.getType(x, y--) == "Diamond") {
			for(x--; x == x++; x++) {
				for(y--; x == x++; x++) {
					if(map.getType(x, y) == "Player") {
						Player.setIsAlive(false);
					}
					map.setType(x, y, '6');
				}
			}
		}
	}
	
	public void kill(MapArray map) {
		if(map.getType(x,  y--) == "Player" || map.getType(x,  y++) == "Player" || map.getType(x--, y) == "Player"
				|| map.getType(x++, y) == "Player" || map.getType(x, y--) == "Rock" || map.getType(x, y--) == "Diamond") {
			for(x--; x == x++; x++) {
				for(y--; x == x++; x++) {
					if(map.getType(x, y) == "Player" ) {
						// DEATH
					}
					map.setType(x, y, '0');
				}
			}
		}
	}
	
	public void gravity(Position position, MapArray map) {
		this.gravity = new Static();
	}
	
	public void move(Position position, MapArray map, Direction direction) {
		this.move = new MoveEnnemy();
	}
	
}
