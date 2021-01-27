import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class button_panel extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	button_panel(draw r){
		setLayout(new GridLayout(1,2));
		JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout(2,4));
		JButton black = new JButton("Black");
		black.setBackground(Color.black);
		black.setActionCommand("Black");
		black.addActionListener(this);
		JButton red = new JButton("red");
		red.setBackground(Color.red);
		red.setActionCommand("red");
		red.addActionListener(this);
		JButton green = new JButton("green");
		green.setBackground(Color.green);
		green.setActionCommand("green");
		green.addActionListener(this);
		JButton blue = new JButton("blue");
		blue.setBackground(Color.blue);
		blue.setActionCommand("blue");
		blue.addActionListener(this);
		JButton yellow = new JButton("yellow");
		yellow.setBackground(Color.yellow);
		yellow.setActionCommand("yellow");
		yellow.addActionListener(this);
		JButton pink = new JButton("pink");
		pink.setBackground(Color.pink);
		pink.setActionCommand("pink");
		pink.addActionListener(this);
		JButton magenta = new JButton("magenta");
		magenta.setBackground(Color.magenta);
		magenta.setActionCommand("magenta");
		magenta.addActionListener(this);
		JButton orange = new JButton("orange");
		orange.setBackground(Color.orange);
		orange.setActionCommand("orange");
		orange.addActionListener(this);
		pan1.add(black);
		pan1.add(red);
		pan1.add(green);
		pan1.add(blue);
		pan1.add(yellow);
		pan1.add(pink);
		pan1.add(magenta);
		pan1.add(orange);
		
		JPanel pan2 = new JPanel();
		pan2.setLayout(new GridLayout(2,2));
		JButton Ellipse = new JButton("Ellipse");
		Ellipse.setActionCommand("Ellipse");
		Ellipse.addActionListener(this);
		JButton Circle = new JButton("Circle");
		Circle.setActionCommand("Circle");
		Circle.addActionListener(this);
		JButton Square = new JButton("Square");
		Square.setActionCommand("Square");
		Square.addActionListener(this);
		JButton Rectangle = new JButton("Rectangle");
		Rectangle.setActionCommand("Rectangle");
		Rectangle.addActionListener(this);
		pan2.add(Ellipse);
		pan2.add(Circle);
		pan2.add(Square);
		pan2.add(Rectangle);
		
		
		this.add(pan1);
		this.add(pan2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		if(name.equalsIgnoreCase("Square")) {
			Window.shapeGlobal = name;
		} 
		else if(name.equalsIgnoreCase("Circle")) {
			//draw.namefigure = name;
			Window.shapeGlobal = name;
		}
		else if(name.equalsIgnoreCase("Ellipse")) {
		//	draw.namefigure = name;
			Window.shapeGlobal = name;
		}
		else if(name.equalsIgnoreCase("Rectangle")) {
		//	draw.namefigure = name;
			Window.shapeGlobal = name;
		}
		if(name.equalsIgnoreCase("black")) {
			Window.shapeColor = name;
		} 
		else if(name.equalsIgnoreCase("red")) {
	//		draw.c = MyColor.getColor(name);
			Window.shapeColor = name;
		}
		else if(name.equalsIgnoreCase("green")) {
			Window.shapeColor = name;
		}
		else if(name.equalsIgnoreCase("blue")) {
			Window.shapeColor = name;
		}
		if(name.equalsIgnoreCase("yellow")) {
			Window.shapeColor = name;
		} 
		else if(name.equalsIgnoreCase("pink")) {
			Window.shapeColor = name;
		}
		else if(name.equalsIgnoreCase("magenta")) {
			Window.shapeColor = name;
		}
		else if(name.equalsIgnoreCase("orange")) {
			Window.shapeColor = name;
		}
//		else {
//			System.err.println(name);
//		}
	}
}
	
