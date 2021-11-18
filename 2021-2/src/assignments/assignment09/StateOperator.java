package assignments.assignment09;

public class StateOperator implements State {
	CalcV1 calcv1;

	public StateOperator(CalcV1 calcv1) {
		this.calcv1 = calcv1;
	}
	
	@Override
	public void printOutResult() {}

	@Override
	public void processNumber(String ch) {
		calcv1.setOperand2(Integer.parseInt(ch));
		calcv1.setState(calcv1.getStateSecondOperand());
	}

	@Override
	public void processOperator(char ch) {}
}
