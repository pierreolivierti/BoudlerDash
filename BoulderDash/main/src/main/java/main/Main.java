package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {
    public static void main(final String[] args) {
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(null,null), new ModelFacade(0,0,""));
        System.out.println();
        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

}
