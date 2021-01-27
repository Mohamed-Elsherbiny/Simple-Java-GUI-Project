
import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math; 

public class Ellipse extends Figure{
	private int major,minor;
	
	public Ellipse(int l1,int l2) {
		super(0,0);
		this.major = l1;
		this.minor = l2;
	}
//	public Ellipse(int l1,int l2, Color col) {
//		super(0,0);
//		this.major = l1;
//		this.minor = l2;
//	}
	public Ellipse(int l1,int l2,int px,int py, Color col) {
		super(new Point(px,py),col);
		this.major = l1;
		this.minor = l2;
	}
	public void setBoundingBox(int heightBB, int widthBB) {
		this.major = heightBB;
		this.minor = widthBB;
	
	}
	public void draw(Graphics g) {
		g.setColor(this.c);
		g.fillOval(this.O.getX(), this.O.getY(), this.major, this.minor);
	}
	
	public double getSurface(){
		double sur = Constants.PI*major*minor/4;
		return sur;
	}
	
	public double getPerimeter() {
		double peri = 2*Constants.PI*Math.sqrt((major*major + minor*minor)/2);
		return peri;
	}
}
