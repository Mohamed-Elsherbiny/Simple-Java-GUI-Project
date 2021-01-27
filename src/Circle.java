

import java.awt.Color;

public class Circle extends Ellipse{

	public Circle(int D) {
		super(D,D);
	}
	public Circle(int D,int px,int py, Color col) {
		super(D,D,px,py,col);
	}
//	public Circle(int px,int py, Color col) {
//		super(px,py,col);
//	}
}
