package model;

public class Stone extends Mobile {
	private static int WIDTH = 16;
	private static int HEIGHT = 16;
	private static int SPEED = 4;
	private static String image = "stone.jpg";
	private Position position;
	
	public Stone(Position position) { 
		super(Direction.DOWN, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		this.position = position;
	}
	
	public void move() {
		this.position.setY(this.position.getY()-1);
	}
	
}
