
//Name - Emery Porter
//Date - 3/3/2017
//Lab  - Pong
import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int width;
	private int height;

	private int xPos;
	private int yPos;
	private int[] coord;

	private Color color;	

	public Block()				  //**default constructor -- do not use all zeros
	{
		xPos = 1;
		yPos = 1;
		width = 1;
		height = 1;
		color = Color.red;
		coord = new int[] { xPos,yPos };
	}

	public Block(int x, int y)  //**initialization constructor
   	{
		xPos = x;
		yPos = y;
		width = 1;
		height = 1;
		color = Color.red;
		coord = new int[] { xPos,yPos };
  	}

   	public Block(int x, int y, int wid, int ht)  //**initialization constructor
   	{
   		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = Color.red;
   	}

	public Block(int x, int y, int wid, int ht, Color col)  //**initialization constructor
	{
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
	}

	public void setWidth(int i)
	{
		width = i;
	}
	
	public void setHeight(int i)
	{
		height = i;
	}
	
	public void setX(int i)
	{
		xPos = i;
	}
	
	public void setY(int i)
	{
		yPos = i;
	}
	
	public void setPos(int x, int y)
	{
		xPos = x;
		yPos = y;
	}

	public void setColor(Color c)
	{
		color = c;
	}
	
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block rhs = (Block)obj;
		if (this.getClass() == rhs.getClass())
		{
			return true;
		}
		return false;
	}   

   public int getWidth()
   {
	   return width;
   }
   
   public int getHeight()
   {
	   return height;
   }
   
   public int getX()
   {
	   return xPos;
   }
   
   public int getY()
   {
	   return yPos;
   }
   
   public Color getColor()
   {
	   return color;
   }
   
   public String toString()
   {
	   return xPos + " " + yPos + " " + width + " " + height + " " + color;
   }
}