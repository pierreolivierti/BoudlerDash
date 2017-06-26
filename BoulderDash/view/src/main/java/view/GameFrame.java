package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Observable;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener{
	private static final long serialVersionUID = 5728867862628418743L;
	private IEventPerformer eventPerformer;
	public GameFrame(final String title, final IEventPerformer eventPerformer, final IGraphicsBuilder graphicsBuilder, final Observable observable){
		this.eventPerformer = eventPerformer;
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setSize(100,100);
		this.setLocationRelativeTo(null);
		decrypt();
		final GamePanel gamePanel = new GamePanel(graphicsBuilder);
		gamePanel.setDoubleBuffered(true);
		observable.addObserver(gamePanel);
		this.setContentPane(gamePanel);
		this.setVisible(true);
	}
		
	public void keyPressed(KeyEvent keyEvent){
		this.eventPerformer.eventPerform(keyEvent);;
	}
		
	public void keyReleased(KeyEvent keyEvent){
	}
		
	public void keyTyped(KeyEvent keyEvent){
	}
	
	public static void decrypt() {
		ObjectInputStream ois = null;
		
		try {
			final FileInputStream file = new FileInputStream("../model/Array");
			ois = new ObjectInputStream(file);
			final char charArray[][] = (char[][]) ois.readObject();
			System.out.println("Test charArray[0][0] = " + charArray[0][0]);
            System.out.println("Test charArray[0][0] = " + charArray[0][1]);
            
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        	try {
        		if(ois != null)
        			ois.close();
        	}
        	catch(IOException e) {
        		e.printStackTrace();
        	}
        }
	}
}
