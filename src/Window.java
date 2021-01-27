import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Window extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	public static String shapeGlobal = "Rectangle" ;
	public static String shapeColor = "black";
	public static draw rec ;
	Menu menu_;
	button_panel buttons;
	public Window(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0,200);
		setSize(500,250);
		
		/* *Create Menu Bar*
		 * Files includes(New,Open,Save, Quit)
		 * About(Authors)
		 * */
		menu_ = new Menu();
		setJMenuBar(menu_);
		
		
		
		Container contentPane = getContentPane();
		/*
		 * Create Rectangle box to the center*
		 */
		 rec = new draw("black","Rectangle");
		/*
		 * Create a panel contain two other panels 
		 */
		buttons = new button_panel(rec);
		contentPane.add(buttons,"South");
		

		contentPane.add(rec,"Center");
		//newWindow newwindow = new newWindow();
		
		
		setVisible(true);
		
		}
	@Override
	public void actionPerformed(ActionEvent e) {

		
		
	}
	
}
