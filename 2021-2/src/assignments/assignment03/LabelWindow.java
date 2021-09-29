package assignments.assignment03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelWindow extends FrameWindow {
    private JLabel label;

    public LabelWindow(String title, int x, int y, int width, int height) {
        super(title, x, y, width, height);
    }

    public void display() {		// 값을 보여주는 메서드 오버로딩
    	updateText(Integer.toString(primeNumber));
	}
    
    public void updateText(String msg) {
        label.setText(msg);
        label.validate();
    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        label = new JLabel();
        panel.add(label);
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }
}
