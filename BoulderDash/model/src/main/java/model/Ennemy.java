package model;

public class Ennemy extends Mobile {
	private Position position;
	private Direction direction;
	private boolean isDead;
	
	public Ennemy(Direction direction, Position position, boolean isDead) {
		this.position = position;
		this.direction = direction;
		this.isDead = isDead;
	}
}
