package model;

public class MapArray {
	private char charArray[][];
	private Object array[][];
	
	public MapArray(int width, int height, String string) {
		
	}
	
	public char getChar(int x, int y) {
		return this.charArray[x][y];
	}
	
	public void setChar(int x, int y, char c) {
		this.charArray[x][y] = c;
	}
	
	public String getType(int x, int y) {
		if(array[x][y] instanceof Mud)
			return "Mud";
		else if(array[x][y] instanceof Background)
			return "Background";
		else if(array[x][y] instanceof Diamond)
			return "Diamond";
		else if(array[x][y] instanceof Enemy)
			return "Enemy";
		else if(array[x][y] instanceof ExitDoor)
			return "ExitDoor";
		else if(array[x][y] instanceof Player)
			return "Player";
		else if(array[x][y] instanceof Stone)
			return "Stone";
		else if(array[x][y] instanceof Wall)
			return "Wall";
		else 
			return "";
	}
	
	public void setType(int i, int j, char c) {
		this.charArray[j][i] = c;
		this.array [j][i] = null;
		try {
			switch(c) {
			case '0':
				this.array[j][i] = new Background(new Position(j, i));
				break;
			case '1':
				this.array[j][i] = new ExitDoor(new Position(j, i));
				break;
			case '2':
				this.array[j][i] = new Mud(new Position(j, i));
				break;
			case '3':
				this.array[j][i] = new Enemy(new Position(j, i), null);
				break;
			case '4':
				this.array[j][i] = new Wall(new Position(j, i));
				break;
			case '5':
				this.array[j][i] = new Stone(new Position(j, i));
				break;
			case '6':
				this.array[j][i] = new Diamond(new Position(j, i));
				break;
			case '7':
				this.array[j][i] = new Player(new Position(j, i), Direction.UP);
				break;
			default:
				throw new Exception("Error: character not valid !\n " + c);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}
}
