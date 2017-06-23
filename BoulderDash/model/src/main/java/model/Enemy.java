package model;

public class Enemy extends Mobile {
	private static int imgPosX = 16;
	private static int imgPosY = 1;
	private int x;
	private int y;
	private boolean isDead;
	
	public Enemy(Position position, MapArray map) {
		super(position,imgPosX, imgPosY);
		this.x = position.getX()
		this.y = position.getY()
		this.isDead = isDead;
	}
	
	public void move() {
		//////////////////////////////////
		// Check if there is wall before//
		//////////////////////////////////
		if (this.direction == Direction.UP) {
			this.position.setY(this.position.getY()+1);
		} else if (this.direction == Direction.DOWN) {
			this.position.setY(this.position.getY()-1);
		} else if (this.direction == Direction.RIGHT) {
			this.position.setX(this.position.getX()+1);
		} else if (this.direction == Direction.LEFT) {
			this.position.setX(this.position.getX()-1);
		}
	}
	
}
