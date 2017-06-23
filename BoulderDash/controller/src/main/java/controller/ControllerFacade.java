package controller;

import java.sql.SQLException;

import model.IModel;
import view.IView;


/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {
    private final IView  view;
    private final IModel model;
    private boolean isGameOver = false;
    private static int SLEEP_TIME = 100;
    
    public ControllerFacade(final IView view, final IModel model) {
        //super();
        this.view = view;
        this.model = model;
    }

    public void start() throws SQLException {
    	this.gameLoop();
    	this.view.displayMessage("Game Over...");
    	this.view.closeAll();
    }
    
    public IView getView() {
    	return this.view;
 
    }
    
    public IModel getModel() {
    	return this.model;
    }
    
    public void setView() {
    	
    }
    
    private void gameLoop() {
    	while (!this.isGameOver) {
    		try {
    			Thread.sleep(SLEEP_TIME);
    		} catch (InterruptedException e) {
    			Thread.currentThread().interrupt();
    		}
    	}
    }
    
    public void orderPerform(UserOrder userOrder) {
    	if(userOrder != null) {
    	}
    }
}