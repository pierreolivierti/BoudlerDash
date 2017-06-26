package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.dao.Map;

public class BoulderDashElement {
	private IGravity gravity;
	private MapArray map;
	private Position position;
	private IModelFacade model;
	private IMovement movement;
	protected BufferedImage image;
	
	public BoulderDashElement(Position position, int imgPosX, int imgPosY) {
		this.position = position;
		try {
			this.buildImage(imgPosX, imgPosY);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public Position getPosition() {
		return this.position;
	}

	public BufferedImage getImage() {
		return this.image;
	}

	public IModelFacade getModelFacade() {
		return this.model;
	}
	
	/*public void placeInArea(IArea area) {
		this.position.setMaxX(area.getDimension().getWidth());
		this.position.setMaxY(area.getDimension().getHeight());
	}

	public void setModel(IModel model) {
		this.model = model;
		this.getPosition().setMaxX(this.getModelFacade().getArea().getDimension().getWidth());
		this.getPosition().setMaxY(this.getModelFacade().getArea().getDimension().getHeight());
	}*/
	
	public void buildImage(int imgPosX, int imgPosY) throws IOException {
		File map = new File(".");
		System.out.println(map.getCanonicalPath() + "/");
		BufferedImage imageSource = ImageIO.read(new File(map.getCanonicalFile() + "/Images/BoulderDash.png"));
		this.image = (imageSource).getSubimage(imgPosX * 16, imgPosY * 16, 16, 16);
	}
	
	public void gravity(Position position, Map map) {
		this.gravity = new NoGravity();
	}
	
	public void move(Position position, MapArray map, Direction direction) {
		this.movement = new NoMove();
	}
}
