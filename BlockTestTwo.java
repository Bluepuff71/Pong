
//Name -
//Date -
//Lab  - BlockTestTwo

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Canvas;

//no additional code needed; this program is complete.
public class BlockTestTwo extends Canvas
{
	public BlockTestTwo()
	{
		setBackground(Color.white);
	}

	public void paint(Graphics window)
	{
		Block one = new Block();
		one.draw(window);

		Block two = new Block(50,50,30,30);
		two.draw(window);

		Block three = new Block(350,350,15,15,Color.red);
		three.draw(window);

		Block four = new Block(450,50,20,60, Color.green);
		four.draw(window);
				
	}
}