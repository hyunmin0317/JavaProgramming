package assignments.assignment08_2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalcGUIV1 extends JFrame implements ActionListener {
    final static int WINDOW_WIDTH = 400;
    final static int WINDOW_HEIGHT = 300;
    final static int COMPONENT_HEIGHT = 40;
    final static int BUTTON_WIDTH = 50;

    String[] buttonText = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "=" };
    JButton[] buttons = new JButton[buttonText.length];
    Calculator calculator;

    Dimension displayDimension = new Dimension(WINDOW_WIDTH - 20, COMPONENT_HEIGHT);
    Dimension buttonDimension = new Dimension(BUTTON_WIDTH, COMPONENT_HEIGHT);

    JLabel display = new JLabel(); // 숫자 값 및 결과 출력 화면

    CalcGUIV1() {
        super("CalcGUIV1");
        calculator = new Calculator();

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Font labelFont = display.getFont();
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font(labelFont.getName(), Font.PLAIN, COMPONENT_HEIGHT - 5));
        display.setPreferredSize(new Dimension(displayDimension));
        setResizable(false);
        setLayout(new BorderLayout());
        add(getDisplayPanel(), BorderLayout.NORTH);
        add(getButtonPanel(), BorderLayout.CENTER);
        clear();
    }

    public JPanel getDisplayPanel() {
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        displayPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        displayPanel.setPreferredSize(displayDimension);
        displayPanel.add(display);
        return displayPanel;
    }
    public JPanel getButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,3,10,5));
        for (int i = 0; i < 10; i++) {
            buttons[i] = new NumberButton(buttonText[i], calculator, display);
            buttons[i].setPreferredSize(buttonDimension);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }
        for (int i = 10; i < 14; i++) {
            buttons[i] = new OperatorButton(buttonText[i], calculator);
            buttons[i].setPreferredSize(buttonDimension);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }
        buttons[14] = new EqualButton(buttonText[14], calculator, display);
        buttons[14].setPreferredSize(buttonDimension);
        buttons[14].addActionListener(this);
        buttonPanel.add(buttons[14]);
        
        return buttonPanel;
    }

    public void showText(String text) {
    	display.setText(text);
    }
    
    public void clear() {
        display.setText("0");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	CommandButton cmdButton = (CommandButton) e.getSource();
        cmdButton.execute();
    }

    public static void main(String[] args) {
        CalcGUIV1 c = new CalcGUIV1();
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setVisible(true);
    }
}

