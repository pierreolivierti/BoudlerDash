package model;

import java.util.ArrayList;

public interface IBoulderDashModel {
		public IArea getArea();
		public void buildArea(Dimension dimension);
		public void addMobile(IMobile mobile);
		public void removeMobile(IMobile mobile);
		public ArrayList<IMobile> getMobiles();
		public void setMobileHaveMoved();
}
