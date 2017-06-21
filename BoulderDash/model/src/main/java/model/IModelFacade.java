package model;

import java.util.ArrayList;

public interface IModelFacade {
	public IArea getArea();
	public void buildeArea(Dimension dimension);
	public void addMobile(IMobile mobile);
	public void removeMobile(IMobile mobile);
	public ArrayList<IMobile> getMobile();
	public void setMobileHaveMoved();
}
