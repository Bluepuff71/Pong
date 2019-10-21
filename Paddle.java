//Name - Emery Porter
//Date - 3/3/2017
//Lab  - Pong
import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
	//instance variables
	private int speed;

	public Paddle()
	{
		super(10,10,10,20);
		speed = 5;
	}

	//**finish the other Paddle constructors
	public Paddle(int x, int y)
	{
		super(x,y,10,20);
		speed = 5;
	}

	public Paddle(int x, int y, int s)
	{
		super(x,y,10,20);
		speed = s;
	}

	public Paddle(int x, int y, int wid, int ht, int s)
	{
		super(x,y,wid,ht);
		speed = s;
	}

	public Paddle(int x, int y, int wid, int ht, Color col, int s)
	{
		super(x,y,wid,ht,col);
		speed = s;
	}

	public void setSpeed(int i)
	{
		speed = i;
	}

	public void moveUpAndDraw(Graphics window)		//this method is finished
	{
		draw(window,Color.BLACK);
		setY(getY()-getSpeed());
		draw(window);
	}

	public void moveDownAndDraw(Graphics window)		//**you need to finish this one
	{
		draw(window,Color.BLACK);
		setY(getY()+getSpeed());
		draw(window);
	}

	public int getSpeed()
	{
		return speed;
	}


	public String toString()
	{
		return super.toString() + " " + speed;
	}
}