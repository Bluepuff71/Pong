
import javax.swing.JFrame;

import java.awt.Component;

//no changes needed
public class TheGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TheGame()
	{
		super("PONG");
		setSize(WIDTH,HEIGHT);
		
		Pong game = new Pong();
		
		((Component)game).setFocusable(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(game);
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		TheGame run = new TheGame();
	}
}