package view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import model.IModel;



public class GraphicsBuilder implements IGraphicsBuilder {
	private IModel model;
	
	public GraphicsBuilder(IModel model){
		this.model = model;
	}
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer){
		
	}
	
	private void buildEmptyGround(){
		 
	}
	 
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){
		 
	}
	public int getGlobalWidth(){
		return 0;
		 
	}
	public int getGlobalHeight(){
		return 0;
		 
	}
}
