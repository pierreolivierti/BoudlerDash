package model;

public class Player extends BoudlerDashElement {
	private static int imgPosX = 2;
	private static int imgPosY = 2;
	private Direction direction;
	private Position position;
	private static int x;
	private static int y;
	
	public Player(Position position, Direction direction) {
		super(position, imgPosX, imgPosY);
		this.position = position;
		this.direction = direction;
	}
	
	public void move() {
		switch(this.direction) {
		case UP:
			this.moveUp(this.position);
			break;
		
		case DOWN:
			this.moveDown(this.position);
			break;
			
		case RIGHT:
			this.moveRight(this.position);
			break;
			
		case LEFT:
			this.moveLeft(this.position);
			break;
		}
	}
	
	public void moveUp(Position position) {
		
	}
	
	public void moveDown(Position position) {
		
	}

	public void moveRight(Position position) {
	
	}

	public void moveLeft(Position position) {
	
	}
}
