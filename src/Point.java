
// 1- Write a class Point having two attributes X and Y
public class Point {
	private int X,Y;
	
	
/* 2- Add the point constructors(A constructor in Java is a special method 
	that is used to initialize objects. The constructor is called when an 
	object of a class is created. It can be used to set initial values for object attributes)
	 and the getx and getY*/ 
	
	
	// Create a class constructor for the Point class
	  public Point() {
	    X = 0;  // Set the initial value for the class attribute X
	    Y = 0;  // Set the initial value for the class attribute X
	  }
	  public Point(int x,int y) {
		    X = x;  // Set the initial value for the class attribute X
		    Y = y;  // Set the initial value for the class attribute X
		  }
	  
	  public int getX() {
		  
		  return X;
	  }
	  
	  public int getY() {
		  
		  return Y;
	  }
	  
	  public void setX(int a) {
		  
		   this.X = a;
	  }
	  
	  public void setY(int b) {
		  
		   this.Y = b;
	  }
	  
	  

}
