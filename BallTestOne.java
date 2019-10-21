//working
//Name -
//Date -
//Lab  - BallTestOne

import static java.lang.System.*;
import java.awt.Color;

//no additional code needed; this program is complete.
class BallTestOne
{
	public static void main( String args[] )
	{
		Ball one = new Ball();
		out.println(one);
		
		Ball two = new Ball(100,90);
		out.println(two);
		
		Ball three = new Ball(100,100,30,50);
		out.println(three);
		
		Ball four = new Ball(100,100,30,50,Color.blue);
		out.println(four);
		
		Ball five = new Ball(100,100,30,50,Color.blue,5,6);
		out.println(five);
		
		Ball six = new Ball(100,100,30,50,Color.blue,5,6);
		out.println(six);		
			
		Ball seven = new Ball(25,15,6,7,4,1);
		out.println (seven);
		
		Ball eight = new Ball ();
		out.println (eight);
		
		eight.setXSpeed(7);
		out.println ("new Xspeed for ball 8: " + eight.getXSpeed());
		
		eight.setYSpeed(99);
		out.println ("new Yspeed for ball 8: " + eight.getYSpeed());
		
		out.println(five.equals(four));		
		
		out.println(five.equals(five));										
	}
}