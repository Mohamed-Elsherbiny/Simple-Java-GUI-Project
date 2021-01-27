import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JMenuBar implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Menu(){
		
	// Initialize File tab
			JMenu File = new JMenu("File");
			JMenuItem New = new JMenuItem("New");
			New.setAccelerator(KeyStroke.getKeyStroke('N' , Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
			New.setActionCommand("New");
			New.addActionListener(this);
			JMenuItem Open = new JMenuItem("Open");
			Open.setAccelerator(KeyStroke.getKeyStroke('O' , Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
			JMenuItem Save = new JMenuItem("Save");
			Save.setAccelerator(KeyStroke.getKeyStroke('S' , Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
			File.add(New);
			File.add(Open);
			File.add(Save);
			File.addSeparator();
			JMenuItem Exit = new JMenuItem("Exit");
			Exit.setAccelerator(KeyStroke.getKeyStroke('E' , Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
			Exit.setActionCommand("Exit");
			Exit.addActionListener(this);
			File.add(Exit);
			this.add(File);
			// Initialize About tab
			JMenu About = new JMenu("About");
			JMenuItem Authors = new JMenuItem("Authors");
			Authors.setAccelerator(KeyStroke.getKeyStroke('A' , Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
			Authors.addActionListener(this);
			About.add(Authors);
			
			this.add(About);
			//setJMenuBar(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if(name.equalsIgnoreCase("Authors")) {
			JOptionPane.showMessageDialog(null, "Mohamed Elsherbiny, MSc Student, University Paris-Saclay (UEVE)","Author", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(name.equalsIgnoreCase("New")) {
			Window.rec.delete();
			repaint();
		}
}
}
