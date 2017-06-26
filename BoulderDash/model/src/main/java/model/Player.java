package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player extends BoulderDashElement {
	private static int imgPosX = 2;
	private static int imgPosY = 2;
	private static String direction;
	private Position position;
	private static boolean isAlive;
	private IGravity gravity;
	private PlayerMove movement;
	
	public Player(Position position, String direction) {
		super(position, imgPosX, imgPosY);
		this.position = position;
		this.direction = direction;
		this.setDirection(direction);
		this.gravity();
		this.move();
	}
	
	@Override
	public void buildImage(int imgPosX, int imgPosY) throws IOException {
		File file = new File(".");
		System.out.println(file.getCanonicalPath() + "/");
		BufferedImage imageSource = ImageIO.read(new File (file.getCanonicalFile() + "/Image/BoulderDash.png"));
		switch(Player.getDirection()) {
		case "UP":
			this.image = (imageSource).getSubimage(imgPosX * 16, imgPosY * 16, 16, 16);
			break;
			
		case "DOWN":
			this.image = (imageSource).getSubimage(imgPosX * 16, imgPosY * 16, 16, 16);
			break;
			
		case "LEFT":
			this.image = (imageSource).getSubimage(imgPosX * 16, imgPosY * 16, 16, 16);
			break;
			
		case "RIGHT":
			this.image = (imageSource).getSubimage(imgPosX * 16,  imgPosY * 16, 16, 16);
			break; 
			
		default:
			break;
		}
	}
	
	public void move() {
		this.movement = new PlayerMove();
	}
	
	public static boolean getIsAlive() {
		return isAlive;
	}
	
	public static void setIsAlive(boolean isAlive) {
		isAlive = isAlive;
	}
	
	public static String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		Player.direction = direction;
	}
	public void gravity() {
		this.gravity = new NoGravity();
	}
 }
