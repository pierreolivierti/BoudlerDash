package model.dao;

public class Map {
	private String name;
	private int id;
	private int width;
	private int height;
	private String mapCode;
	private int nbDiamond;
	
	public Map(String name, int id, int width, int height, String mapCode, int nbDiamond) {
		this.name = name;
		this.id = id;
		this.width = width;
		this.height = height;
		this.mapCode = mapCode;
		this.nbDiamond = nbDiamond;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public String getMapCode() {
		return this.mapCode;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getCountDiamond() {
		return this.nbDiamond;
	}
	
	public String getName() {
		return this.name;
	}
}
