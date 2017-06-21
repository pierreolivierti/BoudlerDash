package model;

public class Ennemy extends Mobile {
	private static int WIDTH = 16;
	private static int HEIGHT = 16;
	private static int SPEED = 4;
	private static String image = "ennemy.jpg";
	private Position position;
	private Direction direction;
	private boolean isDead;
	
	public Ennemy(Direction direction, Position position, boolean isDead) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		this.position = position;
		this.direction = direction;
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
