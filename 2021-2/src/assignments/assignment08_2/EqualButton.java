package assignments.assignment08_2;

import javax.swing.JLabel;

public class EqualButton extends CommandButton {
	private JLabel display;
	
	public EqualButton (String name, Calculator calculator, JLabel display) {
		super(name, calculator);
		this.display = display;
	}

	@Override
	public void execute() {
		int result = 0;
        if (calculator.isOperand1Set() && calculator.isOperand2Set() && calculator.isOperatorSet()) { // 두 개 피 연산자값과 연산자가 지정되었다면
            if (calculator.getOperator() == '+') {
                result = calculator.getOperand1() + calculator.getOperand2();
            }
            else if (calculator.getOperator() == '-') {
                result = calculator.getOperand1() - calculator.getOperand2();
            }
            else if (calculator.getOperator() == '*') {
                result = calculator.getOperand1() * calculator.getOperand2();
            }
            else if (calculator.getOperator() == '/') {
                result = calculator.getOperand1() / calculator.getOperand2();
            }
        }
        display.setText("" + result);
        calculator.clearFlags();
	}
}
