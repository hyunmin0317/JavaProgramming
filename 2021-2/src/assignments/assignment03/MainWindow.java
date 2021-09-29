package assignments.assignment03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends FrameWindow implements ActionListener {
    private static final String MAIN_TITLE = "Main Window";
    private static final String TEXTFIELD_WINDOW_TITLE = "TextField Window";
    private static final String LABEL_WINDOW_TITLE = "Label Window";
    private static final String TEXTFIELD_OBSERVER_BUTTON_TITLE = "Add TextField Window Observer";
    private static final String LABEL_OBSERVER_BUTTON_TITLE = "Add Label Window Observer";
    private static final String TEXTFIELD_OBSERVER_BUTTON_TITLE2 = "Remove TextField Window Observer";
    private static final String LABEL_OBSERVER_BUTTON_TITLE2 = "Remove Label Window Observer";
    private static final String STOP_THREAD_BUTTON_TITLE = "Stop Generating Prime Number";
    private static final int X = 250;
    private static final int Y = 100;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 200;
    private static final int GAP = 50;

    private JButton stopButton;
    private JButton updateTextFieldObserverButton;
    private JButton updateLabelObserverButton;
    private PrimeObservableThread primeThread;
    private TextFieldWindow textFieldWindow;
    private LabelWindow labelWindow;

    public MainWindow(String title) {
        super(title, X, Y, WIDTH, HEIGHT);
        textFieldWindow = new TextFieldWindow(TEXTFIELD_WINDOW_TITLE, X, Y + HEIGHT + GAP, WIDTH, HEIGHT);
        labelWindow = new LabelWindow(LABEL_WINDOW_TITLE, X, Y + (HEIGHT + GAP) * 2, WIDTH, HEIGHT);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                primeThread.stopRunning();
                textFieldWindow.closeWindow();
                labelWindow.closeWindow();
                System.exit(0);
            }
        });
        primeThread = new PrimeObservableThread(); 		// ��ü ����
        primeThread.registerObserver(textFieldWindow);	// primeThread에 textFieldWindow 옵저버 추가
        primeThread.registerObserver(labelWindow);		// primeThread에 textFieldWindow 옵저버 추가
        primeThread.run();  // �Ҽ� ���� ����. �� �Լ��� ����� �Ŀ��� stopButton�� ������ ������ ���� �ݺ���  
    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(width, height));
        updateTextFieldObserverButton = createButton(TEXTFIELD_OBSERVER_BUTTON_TITLE2, this, width, height);
        panel.add(updateTextFieldObserverButton);
        updateLabelObserverButton = createButton(LABEL_OBSERVER_BUTTON_TITLE2, this, width, height);
        panel.add(updateLabelObserverButton);
        stopButton = createButton(STOP_THREAD_BUTTON_TITLE, this, width, height);
        panel.add(stopButton);
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == updateTextFieldObserverButton) {	// updateTextFieldObserverButton 버튼 클릭 시
        	if (updateTextFieldObserverButton.getText() == TEXTFIELD_OBSERVER_BUTTON_TITLE) {
        		primeThread.registerObserver(textFieldWindow);	// primeThread에 textFieldWindow 옵저버 추가
            	updateTextFieldObserverButton.setText(TEXTFIELD_OBSERVER_BUTTON_TITLE2);
        	} else {
        		primeThread.removeObserver(textFieldWindow);	// primeThread에 textFieldWindow 옵저버 삭제
            	updateTextFieldObserverButton.setText(TEXTFIELD_OBSERVER_BUTTON_TITLE);
        	}
        }
        else if (e.getSource() == updateLabelObserverButton) {	// updateLabelObserverButton 버튼 클릭 시
        	if (updateLabelObserverButton.getText() == LABEL_OBSERVER_BUTTON_TITLE) {
        		primeThread.registerObserver(labelWindow);		// primeThread에 textFieldWindow 옵저버 추가
            	updateLabelObserverButton.setText(LABEL_OBSERVER_BUTTON_TITLE2);
        	} else {
        		primeThread.removeObserver(labelWindow);		// primeThread에 textFieldWindow 옵저버 삭제
            	updateLabelObserverButton.setText(LABEL_OBSERVER_BUTTON_TITLE);
        	}
        }
        else if (e.getSource() == stopButton) {
            primeThread.stopRunning();
        }
    }

    private JButton createButton(String text, ActionListener listener, int width, int height) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        Dimension buttonDimension = new Dimension(width, height / 3);
        button.setMaximumSize(buttonDimension);
        button.setMinimumSize(buttonDimension);
        button.setPreferredSize(buttonDimension);
        return button;
    }
    
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow(MainWindow.MAIN_TITLE);
    }
}
