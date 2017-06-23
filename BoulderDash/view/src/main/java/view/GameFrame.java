package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener{
	private static final long serialVersionUID = 5728867862628418743L;
	private IEventPerformer eventPerformer;
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable){
		
	}
		
	public void keyPressed(KeyEvent keyEvent){
		this.eventPerformer.eventPerformer(keyEvent);;
	}
		
	public void keyReleased(KeyEvent keyEvent){
	}
		
	public void keyTyped(KeyEvent keyEvent){
	}
}
