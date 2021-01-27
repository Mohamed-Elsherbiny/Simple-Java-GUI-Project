import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Figure {
	
	//private Point O = new Point();
	
	private int length;
	private int width;
	//private Color c; 

	public Rectangle(int w,int l) {
		super(new Point(0,0),Color.black);
		/*O.setX(0);
		O.setY(0);*/
		length = l;
		width = w;
	}
	public Rectangle(int w,int l,Color col) {
		super(new Point(0,0),col);
		/*O.setX(0);
		O.setY(0);*/
		length = l;
		width = w;
	}
	public Rectangle(int len,int wid,int px,int py, Color col) {
		super(new Point(px,py),col);
		this.length = len;
		this.width = wid;
	}
	public void setBoundingBox(int heightBB, int widthBB) {
		this.length = heightBB;
		this.width = widthBB;
	}
	public void draw(Graphics g) {
		g.setColor(this.c);
		g.fillRect(this.O.getX(),this.O.getY(),this.length, this.width);
	}
	
//	public Rectangle(int w,int l, Color col) {
//		super(0,0);
//		/*O.setX(0);
//		O.setY(0);*/
//		length = l;
//		width = w;
//		c = col;
//	}
	/*public Rectangle(int a,int b) {
		O.setX(a);
		O.setY(b);
		
	}*/
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int len) {
		length = len;
	}
	
	public void setWidth(int wid) {
		width = wid;
	}
	
	public double getSurface(){
		double sur = width*length;
		return sur;
	}
	
	public double getPerimeter() {
		double peri = 2*width+2*length;
		return peri;
	}
	/*
	public String display()
	{
		System.out.print("+");
		for (int i = 0;i<width;i++) {
			System.out.print("--");
		}
		System.out.print("+");
		System.out.println();
		for (int i = 0;i<length;i++) {
			System.out.print("|");
			for(int j=0;j<width;j++) {
		
					System.out.print("  ");
				
			}
			System.out.println("|");
		}
		System.out.print("+");
		for (int i = 0;i<width;i++) {
			System.out.print("--");
		}
		System.out.print("+");
		return null;
	
		
	}*/
	public String toString()
	{
		
		String str = "+";
		for (int i = 0;i<width;i++) {
			str +=  "--";
		}
		str += "+";
		str += "\n";
		for (int i = 0;i<length;i++) {
			str += "|";
			for(int j=0;j<width;j++) {
		
				str += "  ";
				}
			str += "|";
			str += "\n";
		}
		str += "+";
		for (int i = 0;i<width;i++) {
			str += "--";
		}
		str += "+";
		return str;
		}
	
	
}
