package model;

public class MapArray {
	private char charArray[][];
	private Object array[][];
	
	public Map(int width, int height, String string) {
		int n = 0;
		char c;
		this.charArray = new char[width][height];
		this.array = new Object[width][height];
		try {
			for (int j = 0; j < height; j++) {
				for (int i = 0; i < width; i++) {
					c = string.charAt(n);
					switch (c) {
					case '0':
						this.array[j][i] = new Background(new Position(j, i));
						array[j][i] = c;
						break;
						
					case '1':
						this.array[j][i] = new ExitDoor(new Position(j, i), new Dimension(16,16));
						array[j][i] = c;
						break;
					}
				}
			}
		} catch (Exception e){
			System.err.println(e.getMessage());
			System.exit(1);
			
		}
	}
}
