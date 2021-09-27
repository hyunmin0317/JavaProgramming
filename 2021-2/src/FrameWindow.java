import javax.swing.*;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public abstract class FrameWindow implements Observer {
    private JFrame frame;
    
    public int primeNumber;
    private Observable observable;
    
    @Override
	public void update(int primeNumber) {	// 값을 업데이트하는 메서드 오버라이딩
		this.primeNumber = primeNumber;
		display();	
	}
	
	public void display() {		// 값을 보여주는 메서드
		System.out.println(primeNumber);
	}
    
    public FrameWindow(String title, int x, int y, int width, int height) {
        frame = createWindow(title, x, y, width, height);
    }
    
    public FrameWindow(String title, int x, int y, int width, int height, WindowListener lis) {
        frame = createWindow(title, x, y, width, height);
        frame.addWindowListener(lis);
    }

    public JFrame createWindow(String title, int x, int y, int width, int height) {
        JFrame frame;
        frame = new JFrame(title);
        frame.setBounds(x, y, width, height);
        JPanel panel = createPanel(width, height);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        return frame;
    }

    public void closeWindow() {
        frame.setVisible(false);
        frame.dispose();
    }

    public void addWindowListener(WindowListener lis) {
        frame.addWindowListener(lis);
    }

    public abstract JPanel createPanel(int width, int height);
}
