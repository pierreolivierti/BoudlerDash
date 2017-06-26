package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dao.ExampleDAO;

public class ModelFacade implements IModelFacade, Serializable {
	private static final long serialVersionUID = 4104235711353819536L;
	private char charArray[][];
	private Object array[][];
	
	public ModelFacade(int x, int y, String string) {
		this.charArray = new char[x][y];
		this.array = new Object[x][y];
		try {
			int n = 0;
			char c;
			for (int j = 0; j < y; j++) {
				for (int i = 0; i < x; i++) {
					c = string.charAt(n);
					switch (c) {
					case '0':
						this.array[j][i] = new Background(new Position(j, i));
						array[j][i] = c;
						break;
						
					case '1':
						this.array[j][i] = new ExitDoor(new Position(j, i));
						array[j][i] = c;
						break;
						
					case '2':
						this.array[j][i] = new Mud(new Position(j, i));
						array[j][i] = c;
						break;
						
					case '3':
						this.array[j][i] = new Enemy(new Position(j, i), null);
						array[j][i] = c;
						break;
					
					case '4':
						this.array[j][i] = new Wall(new Position(j, i));
						array[j][i] = c;
						break;
						
					case '5':
						this.array[j][i] = new Stone(new Position(j, i));
						array[j][i] = c;
						break;
						
					case '6':
						this.array[j][i] = new Diamond(new Position(j, i));
						array[j][i] = c;
						break;
						
					case '7':
						this.array[j][i] = new Player(new Position(j, i), "UP");
						array[j][i] = c;
						break;
						
					default:
						n++;
					}
				}
			}
		} catch (Exception e){
			System.err.println(e.getMessage());
			System.exit(1);
			
		}
		generateMapArray(charArray);
		decrypt();
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
				this.array[j][i] = new Player(new Position(j, i), "UP");
				break;
			default:
				throw new Exception("Error: character not valid !\n " + c);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}
		
	public char[][] getCharArray() {
		return this.charArray;
	}
	
	public Object[][] getArray() {
		return this.array;
	}
	
	public static void generateMapArray(char charArray[][]) {
		ObjectOutputStream oos = null;
		
		try {
			FileOutputStream file = new FileOutputStream("Array");
			oos = new ObjectOutputStream(file);
			oos.writeObject(charArray);
			oos.flush();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {
					oos.flush();
					oos.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void decrypt() {
		ObjectInputStream ois = null;
		
		try {
			FileInputStream file = new FileInputStream("Array");
			ois = new ObjectInputStream(file);
			char charArray[][] = (char[][]) ois.readObject();
			System.out.println(charArray[0][0]);
			System.out.println(charArray[0][1]);
		} catch(java.io.IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException c) {
			c.printStackTrace();
		} finally {
			try {
				if(ois != null) {
					ois.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public IBoulderDashElement[] getElement() {
		ArrayList<BoulderDashElement> list = new ArrayList<BoulderDashElement>();
		for(int j = 0; j < this.array.length; j++) {
			for(int i = 0; i < this.array[j].length; i++) {
				list.add((BoulderDashElement) this.array[j][i]);
			}
		}
		return (IBoulderDashElement[]) list.toArray(new BoulderDashElement[0]);
	}
	
	public boolean isGameOver() {
		if(Player.getIsAlive() == false || ExitDoor.getWin() == true) {
			return true;
		}
		return false;
	}
}
