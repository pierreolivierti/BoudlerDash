package view;

import java.util.Observable;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import model.IModelFacade;
import model.IOrderPerformer;

public class ViewFacade implements IView, Runnable {
	private GraphicsBuilder graphicsBuilder;
	private EventPerformer eventPerformer;
	private Observable observable;
	private GameFrame gameFrame;
    
	public ViewFacade(IOrderPerformer orderPerformer, IModelFacade model) {
        this.observable = (Observable) model;
        this.graphicsBuilder = new GraphicsBuilder(model);
        this.eventPerformer = new EventPerformer(orderPerformer);
        SwingUtilities.invokeLater(this);
    }
    
	@Override
	public void run() {
		this.gameFrame = new GameFrame("BoulderDash", this.eventPerformer, this.graphicsBuilder, this.observable);		
	}
	@Override
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	@Override
	public void closeAll() {
		this.gameFrame.dispose();
	}
    

}
