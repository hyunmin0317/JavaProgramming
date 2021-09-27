import javax.swing.*;

import exercises.week04.Observer;

import java.awt.event.WindowListener;
import java.util.ArrayList;

public abstract class FrameWindow implements Subject {
    private JFrame frame;
    
    private ArrayList observers;
    private int primeNumber;
   
    public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(primeNumber);
		}
	}

    public FrameWindow(String title, int x, int y, int width, int height) {
        frame = createWindow(title, x, y, width, height);
        observers = new ArrayList();
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
