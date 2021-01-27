import java.awt.Color;
import java.awt.Graphics;

/*Change Figure class from class to abstract class */

/*	Data abstraction is the process of hiding certain details and showing only essential information
 	to the user.
	
	Abstraction can be achieved with either abstract classes or interfaces. 

	The abstract keyword is a non-access modifier, used for classes and methods:

	- Abstract class: is a restricted class that cannot be used to create objects 
	  (to access it, it must be inherited from another class).

	- Abstract method: can only be used in an abstract class, and it
	  does not have a body. The body is provided by the subclass (inherited from).*/
public abstract class Figure {
	
	protected Point O = new Point();
	protected Color c ;
	public abstract void setBoundingBox(int heightBB, int widthBB);
	public abstract void draw(Graphics g)	;
	public Figure(int a,int b) 
		{
				O.setX(a); O.setY(b);
		}
	public Figure(Point p, Color col) 
	{
			O.setX(p.getX()); O.setY(p.getY());
			c = col;
	}
	
		
}
	





	

