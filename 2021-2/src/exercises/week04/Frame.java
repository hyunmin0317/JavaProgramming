package exercises.week04;

import javax.swing.*;
import java.awt.*;

public class Frame {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 400);
		
		Container pane = f.getContentPane();
		JPanel p = new JPanel();
		JButton b1 = new JButton("hello1");
		JButton b2 = new JButton("hello2");
		
		b1.addActionListener(new ButtonListener());
		p.add(b1);
		p.add(b2);
		pane.add(p);
		
		f.setVisible(true);
		f.setTitle("Main");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}