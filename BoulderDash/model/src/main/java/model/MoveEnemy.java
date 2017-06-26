package model;

public class MoveEnemy {
	private int x;
	private int y;
	@SuppressWarnings("unused")
	private boolean previousDirectionX;
	@SuppressWarnings("unused")
	private boolean previousDirectionY;
	
	
	public void move(Position position, MapArray map, Direction direction) {
		x = position.getX();
		y = position.getY();
		
		if(map.getType(x, y++) != "Avoid")
			this.moveRight(position, map, direction);
		else if(map.getType(x++, y) != "Avoid")
			this.moveDown(position, map, direction);
		else if(map.getType(x, y--) != "Avoid")
			this.moveLeft(position, map, direction);
		else if(map.getType(x--, y) != "Avoid")
			this.moveUp(position, map, direction);
		if (map.getType(x, y++) == "Avoid" && map.getType(x, y--) == "Avoid") {
			this.VerticalMove(position, map, direction);
		}
		if (map.getType(x++, y) == "Avoid" && map.getType(x--, y) == "Avoid") {
			this.HorizontalMove(position, map, direction);
		}
	}
	
	public void moveUp(Position position, MapArray array, Direction direction) {
		y++;
		previousDirectionY = true;
		position.setY(y);
	}
	
	public void moveDown(Position position, MapArray array, Direction direction) {
		y--;
		previousDirectionY = false;
		position.setY(y);
	}
	
	public void moveLeft(Position position, MapArray array, Direction direction) {
		x--;
		previousDirectionX = false;
		position.setX(x);
	}
	
	public void moveRight(Position position, MapArray array, Direction direction) {
		x++;
		previousDirectionX = true;
		position.setX(x);
	}
	
	public void VerticalMove(Position position, MapArray array, Direction direction) {
		if (previousDirectionX = true)
			y++;
		else
			y--;
		position.setY(y);
	}
	
	public void HorizontalMove(Position position, MapArray array, Direction direction) {
		if (previousDirectionY = true)
			x--;
		else
			x++;
		position.setX(y);
	}
}
