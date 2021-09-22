package exercises.week04;

import javax.swing.*;
import java.awt.*;

public class Frame {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 400);
		
		Container pane = f.getContentPane();
		JButton b = new JButton("hello");
		pane.add(b);
		
		f.setVisible(true);
		f.setTitle("Main");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}