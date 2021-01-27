import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class draw extends JPanel implements  MouseListener{

	private static final long serialVersionUID = 1L;
	
	
	
	private ArrayList<Figure> figure = new ArrayList<Figure>();  //no size needed
	public  Color c ;
	public  String namefigure ;
	private int x,y;
	//private boolean dragging = false;
	
	public draw() {
		this.c = MyColor.getColor("black");
		this.namefigure = "Rectangle";
	}
	
	public draw(String color, String shape) {
		this.c = MyColor.getColor(color);
		//draw.namefigure = shape;
		this.namefigure = shape;
		this.addMouseListener(this);
		//addMouseMotionListener(this);
	//	System.out.println(Window.shapeGlobal);
	}
	
	public void setShape(String name) {
		this.namefigure = 	name;
	}
	
	public ArrayList<Figure> getfigs(){
		return this.figure;
	}
	
	public void delete() {
		this.figure.clear();
	}
	   
//	   public void paint(Graphics g) {
//      Graphics2D g2D = (Graphics2D) g;
//      g2D.drawRect(0, 0, 100, 100);
//      
//	   }
	   @Override
	   public void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      for(Figure f : this.figure){
	    	  f.draw(g); 
	    	  }
	   }

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		//System.out.println("Shape clicked"+Window.shapeGlobal);
		//repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	//	System.out.println("Mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int X = arg0.getX();
		int Y = arg0.getY();
		System.out.println(X+","+Y);
//		System.out.println("Click");
		
		
		this.x = X;
		this.y = Y;
	//	this.dragging = true;
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
//		this.dragging = false;
		int Xreleased = arg0.getX();
		int Yreleased =  arg0.getY();
		int dX = Math.abs(this.x - Xreleased) ;
		int dY = Math.abs(this.y - Yreleased);
		System.out.println(Xreleased+","+Yreleased);
		System.out.println("dx = "+dX +"& dy = " + dY);
		if(Window.shapeGlobal.equalsIgnoreCase("Square")) {
			this.figure.add( new Square(dX,this.x,this.y,MyColor.getColor(Window.shapeColor))) ;
			} 
		else if(Window.shapeGlobal.equalsIgnoreCase("Circle")) {
			this.figure.add(new Circle(dX,this.x,this.y,MyColor.getColor(Window.shapeColor)));
		   }
		else if(Window.shapeGlobal.equalsIgnoreCase("Rectangle")) {
			this.figure.add(new Rectangle(dX,dY,this.x,this.y,MyColor.getColor(Window.shapeColor)));
		   }
		else if(Window.shapeGlobal.equalsIgnoreCase("Ellipse")) {
			this.figure.add(new Ellipse(dX,dY,this.x,this.y,MyColor.getColor(Window.shapeColor)));
		   }
		repaint();
	}
//	@Override
//    public void mouseDragged(MouseEvent event) {
////		  if (this.dragging) {
////
////				
////				repaint();
////			  }
//		 
//
//    }
//
//	@Override
//	public void mouseMoved(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
}
