package model;

public class Stone extends Mobile {
	private static int imgPosX = 13;
	private static int imgPosY = 1;
	
	public Stone(Position position) { 
		super(Direction.DOWN, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		this.position = position;
	}
	
	public void move() {
		this.position.setY(this.position.getY()-1);
	}
	
}
