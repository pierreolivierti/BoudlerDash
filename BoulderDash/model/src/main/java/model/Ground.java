package model;

public class Ground implements IArea {
	private Dimension dimension;
	private String image = "ground.jpg";
	private char chartab[][];
	private Object test[][];
	
	public Ground(Dimension dimension) {
		this.dimension = dimension;
		this.chartab = new char[2][2];
	}
	
	public Dimension getDimension() {
		return this.dimension;
	}
	
	public String getImage() {
		return this.image;
	}
}
