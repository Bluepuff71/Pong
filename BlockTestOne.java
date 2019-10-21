
//Name -
//Date -
//Lab  - BlockTestOne

import static java.lang.System.*;
import java.awt.Color;

//no additional code needed; this program is complete.
class BlockTestOne
{
	public static void main( String args[] )
	{
		Block one = new Block();   //black box
		out.println(one);

		Block two = new Block(50,50,30,30);  //black box
		out.println(two);

		Block three = new Block(350,350,15,15,Color.red);
		out.println(three);

		Block four = new Block(450,50,20,60, Color.green);
		out.println(four);

		Block five = new Block (100,100);
		out.println (five);
		
		five.setX(30);
		out.println ("\n\nnew x for block 5: " + five.getX());
		five.setY(33);	
		out.println ("new y for block 5: " + five.getY());	
		five.setPos(50,55);
		out.println ("new x & y for block 5: " + five.getX() + " " + five.getY());
		five.setWidth (100);
		out.println ("new width for block 5: " + five.getWidth());
		five.setHeight (15);
		out.println ("new height for block 5: " + five.getHeight());
		Color bob =new Color(255,20,147);
		five.setColor(bob);
		out.println ("new color for block 5:  " +five.getColor());
		out.println ("new block 5 attributes: " + five);
		out.println("\n"+one.equals(two));
		out.println(one.equals(one));		
	}
}