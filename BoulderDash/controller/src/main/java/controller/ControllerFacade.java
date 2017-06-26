package controller;

import java.sql.SQLException;

import model.IModelFacade;
import view.IView;

public class ControllerFacade implements IController {
    private IView  view;
    private IModelFacade model;
    private boolean isGameOver = false;
    private static int SLEEP_TIME = 100;
    
    public ControllerFacade(final IView view, final IModelFacade modelFacade) {
        this.view = view;
        this.model = modelFacade;
    }

	public void start() throws SQLException {
    	this.gameLoop();
    	this.view.displayMessage("Game Over...");
    	this.view.closeAll();
    }
    
    public IView getView() {
    	return this.view;
 
    }
    
    public IModelFacade getModel() {
    	return this.model;
    }
    
    public void setView(IView view) {
    	this.view = view;
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
}