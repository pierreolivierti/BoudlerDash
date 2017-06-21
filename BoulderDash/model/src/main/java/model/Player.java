package model;

public class Player extends Mobile {
	private static int WIDTH = 16;
	private static int HEIGHT = 16;
	private static int SPEED = 4;
	private static String image = "player.jpg";
	private int score = 0;
	private Direction direction;
	private Position position;
	
	public Player(Direction direction, Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		this.position = position;
		this.direction = direction;
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
	
	public void addDiamondToScore() {
		this.score++;
	}
}
