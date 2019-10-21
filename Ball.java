
//Name - Emery Porter
//Date - 3/3/2017
//Lab  - Pong

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200,10,10);
		xSpeed = 3;
		ySpeed = 1;
	}

	//**finish the other Ball constructors, use xSpeed=3 and ySpeed=1 for now.
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int wid, int ht)
	{
		super(x,y,wid,ht);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int wid, int ht, Color col)
	{
		super(x,y,wid,ht,col);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int wid, int ht, int xSpd, int ySpd)
	{
		super(x,y,wid,ht);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}

	public Ball(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
	{
		super(x,y,wid,ht,col);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	
	public void setXSpeed(int i)
	{
		xSpeed = i;
	}
	
	public void setYSpeed(int i)
	{
		ySpeed = i;
	}

	//TODO make this modular
	public void moveAndDraw(Graphics window)
	{
		draw(window,Color.BLACK);
		setX(getX()+xSpeed);
		setY(getY()+ySpeed);
		draw(window);
	}

	//**balls are equal if super "blocks" are equal and xSpeed and ySpeed are equal
	public boolean equals(Object obj)
	{
		Ball rhs = (Ball)obj;

		return false;

	}   

	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	
	public String toString()
	{
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
}