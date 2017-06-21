package model;

public class Ground implements IArea {
	private Dimension dimension;
	private String image = "ground.jpg";
	
	public Ground(Dimension dimension) {
		this.dimension = dimension;
	}
	
	public Dimension getDimension() {
		return this.dimension;
	}
	
	public String getImage() {
		return this.image;
	}
}
