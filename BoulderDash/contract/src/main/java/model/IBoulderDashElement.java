package model;

import java.awt.image.BufferedImage;;

public interface IBoulderDashElement {
	public IPosition getPosition();
	public BufferedImage getImage();
	public IModelFacade getModelFacade();
}