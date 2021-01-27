

import java.awt.Color;

public class Square extends Rectangle{
	public int len;

	
	public Square(int l) {
		//this.length = l;
		super(l,l);
	}
	public Square(int l,int x,int y, Color col) {
		//this.length = l;
		super(l,l,x,y,col);
	}
	public Square(int l ,Color col) {
		super(l,l,col);
	}
	
	public void setlength(int l) {
		super.setLength(l);
		super.setWidth(l);
	}

}
