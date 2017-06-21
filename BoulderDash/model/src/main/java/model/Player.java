package model;

public class Player {
	private int score = 0;
	private Direction direction;
	private Position position;
	
	public Player(Direction direction, Position position) {
		this.position = position;
		this.direction = direction;
	}
}
