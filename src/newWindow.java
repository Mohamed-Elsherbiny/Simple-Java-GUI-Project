import java.awt.Font;

import javax.swing.*;

public class newWindow extends JFrame {
	
	
	public String text;
	private static final long serialVersionUID = 1L;
//	JFrame frame = new JFrame();

	newWindow(String auther){
		super(auther);
		System.out.print(text);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,700);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public void settext(String s) {
		
		this.text = s;
		JLabel label = new JLabel(this.text);
		   label.setBounds(0,0,1000,50);
			label.setFont(new Font(null,Font.PLAIN,25));
			this.add(label);
	}

}
