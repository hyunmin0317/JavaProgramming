package assignments.assignment08;

import javax.swing.JButton;

public class OperatorButton implements Command {
	private JButton cmdButton;
	private Calculator calculator;
	
	public OperatorButton(Calculator calculator) {
		this.calculator = calculator;
	}

	public void setCmdButton(JButton cmdButton) {
		this.cmdButton = cmdButton;
	}

	@Override
	public void execute() {
		if (calculator.isOperand1Set()) {  // 첫 번째 피연산자 값이 지정되어야만 연산자 처리 가능
            calculator.setOperatorSet(true);
            calculator.setOperator(cmdButton.getText().charAt(0));
        }
	}

}
