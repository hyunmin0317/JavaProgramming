package exercises.week13;

import java.awt.Graphics;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(300, 300);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("내가 최고!!", 100, 100);
	}
	
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("헤드 퍼스트 디자인 패턴");
	}
}
