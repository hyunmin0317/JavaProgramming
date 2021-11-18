package assignments.assignment09;

public class StateSecondOperand implements State {
	CalcV1 calcv1;

	public StateSecondOperand(CalcV1 calcv1) {
		this.calcv1 = calcv1;
	}
	
	@Override
	public void printOutResult() {
		int operand1 = calcv1.getOperand1();
	    int operand2 = calcv1.getOperand2();
	    char operator = calcv1.getOperator();
		
		switch (operator) {
        case '+':
            System.out.printf("%d + %d = %d\n", operand1, operand2, operand1 + operand2);
            break;

        case '-':
            System.out.printf("%d - %d = %d\n", operand1, operand2, operand1 - operand2);
            break;

        case '*':
            System.out.printf("%d * %d = %d\n", operand1, operand2, operand1 * operand2);
            break;

        case '/':
            System.out.printf("%d / %d = %d\n", operand1, operand2, operand1 / operand2);
            break;
		}
	}

	@Override
	public void processNumber(String ch) {}

	@Override
	public void processOperator(char ch) {
		if (ch == '=') {
			calcv1.printOutResult();
            calcv1.setState(calcv1.getStateStart());
        }
	}
}
