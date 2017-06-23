package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BoulderDashElement implements IBoulderDashElement {
	private Mobile mobile;
	private MapArray map;
	private Position position;
	protected BufferedImage image;
	private IModel model;
	
	public BoulderDashElement(Position position, int imgPosX, int imgPosY) {
		this.position = position;
		try {
			this.buildImage(imgPosX, imgPosY);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return this.position;
	}

	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return this.image;
	}

	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		this.position.setMaxX(area.getDimension().getWidth());
		this.position.setMaxY(area.getDimension().getHeight());
	}

	public void setModel(IModel model) {
		// TODO Auto-generated method stub
		this.model = model;
		this.getPosition().setMaxX(this.getModelFacade().getArea().getDimension().getWidth());
		this.getPosition().setMaxY(this.getModelFacade().getArea().getDimension().getHeight());
	}
	
	public IModel getModelFacade() {
		return this.model;
	}
	
	public void buildImage(int imgPosX, int imgPosY) throws IOException {
		File map = new File(".");
		System.out.println(map.getCanonicalPath() + "/");
		BufferedImage imageSource = ImageIO.read(new File(map.getCanonicalFile() + "/Images/BoulderDash.png"));
		this.image = (imageSource).getSubimage(imgPosX * 16, imgPosY * 16, 16, 16);
	}
	
	public void gravity(Position position, Map map) {
		gravity(position, map);
	}
}
