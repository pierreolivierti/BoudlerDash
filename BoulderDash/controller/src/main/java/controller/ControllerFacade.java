package controller;

import java.sql.SQLException;
import java.io.IOException;


import java.util.List;

import model.Example;
import model.IModel;
import view.IView;
import controller.UserOrder;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    private boolean isGameOver = false;
    private static int SLEEP_TIME = 100;
    
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
    	
    	this.gameLoop();
    	this.view.displayMessage("Game Over...");
    	this.view.closeAll();
    	
        this.getView().displayMessage(this.getModel().getExampleById(1).toString());

        this.getView().displayMessage(this.getModel().getExampleByName("Example 2").toString());

        final List<Example> examples = this.getModel().getAllExamples();
        final StringBuilder message = new StringBuilder();
        // a.append(" bar);
        for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
    
    private void gameLoop() {
    	while (!this.isGameOver) {
    		try {
    			Thread.sleep(SLEEP_TIME);
    		} catch (final InterruptedException ex) {
    			Thread.currentThread().interrupt();
    		}
    	}
    }
    
    @Override
    public void orderPerform(UserOrder userOrder) {
    	if (userOrder != null) {
    		Direction direction;
    		switch (userOrder.getOrder()) {
    		case UP:
    			direction = Direction.UP;
    			break;
    		case RIGHT:
    			direction = Direction.RIGHT;
    			break;
    		case DOWN:
    			direction = Direction.DOWN;
    			break;
    		case LEFT:
    			direction = Direction.LEFT;
    			break;
    		default:
    			break;
    		}
    		player.setDirection(direction);
    	}
    }
}
<<<<<<< HEAD

//commit1
=======
>>>>>>> origin/master
//test
