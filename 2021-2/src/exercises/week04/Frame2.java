package exercises.week04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame2 implements ActionListener {
	JButton b1;
	JButton b2;
	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b == b1) {
			System.out.println("b1 clicked");
		} else if (b == b2) {
			System.out.println("b2 clicked");
		}
	}
	
	public void createWindow() {
		JFrame f = new JFrame("Main Window");
		f.setSize(600, 400);
		
		Container pane = f.getContentPane();
		JPanel p = new JPanel();
		b1 = new JButton("hello1");
		b2 = new JButton("hello2");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		p.add(b1);
		p.add(b2);
		pane.add(p);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Frame2 f = new Frame2();
		f.createWindow();	
	}
}
