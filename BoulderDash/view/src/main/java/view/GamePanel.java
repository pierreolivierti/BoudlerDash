package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {
	private static final long serialVersionUID = 1556351483680572260L;
	private IGraphicsBuilder graphicsBuilder;
	
	public GamePanel(IGraphicsBuilder graphicsBuilder){
		this.graphicsBuilder = graphicsBuilder;
	}
	
	public void paintComponent(Graphics graphics){
		this.graphicsBuilder.applyModelToGraphic(graphics, this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.repaint();
	} 
}
