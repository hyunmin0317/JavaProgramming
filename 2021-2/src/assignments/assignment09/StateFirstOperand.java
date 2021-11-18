package assignments.assignment09;

public class StateFirstOperand implements State {
    CalcV1 calcv1;

	public StateFirstOperand(CalcV1 calcv1) {
		this.calcv1 = calcv1;
	}
	
	@Override
	public void printOutResult() {}

	@Override
	public void processNumber(String ch) {}

	@Override
	public void processOperator(char ch) {
		calcv1.setState(calcv1.getStateOperator());
		calcv1.setOperator(ch);
	}
}
