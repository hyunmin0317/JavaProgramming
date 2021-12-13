package exam.final2019;

public class OperatorButton extends CommandButton {

	public OperatorButton(Calculator calculator) {
		super(calculator);
	}
	
	@Override
	public void execute() {
		 if (calculator.isOperand1Set()) {  // 첫 번째 피연산자 값이 지정되어야만 연산자 처리 가능
             calculator.setOperatorSet(true);
             calculator.setOperator(getText().charAt(0));
         }
	}
}
