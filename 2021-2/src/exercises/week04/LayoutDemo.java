package exercises.week04;

import javax.swing.*;
import java.awt.*;

public class LayoutDemo {
	public static void main(String[] args) {
		JFrame f = new JFrame("Window");
		
		JButton b1 = new JButton("hello 1");
		b1.setPreferredSize(new Dimension(1000, 100));
		b1.setMinimumSize(new Dimension(600, 100));
		b1.setMaximumSize(new Dimension(1200, 100));
		
		JButton b2 = new JButton("hello 2");
		b2.setPreferredSize(new Dimension(1000, 100));
		b2.setMinimumSize(new Dimension(600, 100));
		b2.setMaximumSize(new Dimension(1200, 100));
		
		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(1000, 3000));
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(b1);	p.add(b2);
		
		f.getContentPane().add(p);
		f.pack();
		f.setVisible(true);
	}
}

