//
//Name -
//Date -
//Lab  - PaddleTestOne

import static java.lang.System.*;
import java.awt.Color;

class PaddleTestOne
{
	public static void main( String args[] )
	{
		Paddle one = new Paddle();
		out.println(one);
		
		Paddle two = new Paddle(100,90);
		out.println(two);
		
		Paddle three = new Paddle(100,100,30);
		out.println(three);
		
		Paddle four = new Paddle(100,100,30,50,8);
		out.println(four);
		
		Paddle five = new Paddle(100,100,30,20, Color.green,6);
		out.println(five);
		
		out.println ("\nold speed for Paddle five: " + five.getSpeed());		
		five.setSpeed(40);
		out.println ("new speed for Paddle five: " + five.getSpeed());
		out.println("\n"+five.equals(four));		
		
		out.println(five.equals(five));										
	}
}