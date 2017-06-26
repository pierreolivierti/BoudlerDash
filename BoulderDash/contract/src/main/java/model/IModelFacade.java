package model;

public interface IModelFacade {
	public Object[][] getArray();
	public void setType(int i, int j, char c);
	public String getType(int x, int y);
	public char[][] getCharArray();
	public IBoulderDashElement[] getElement();
	public boolean isGameOver();
}
