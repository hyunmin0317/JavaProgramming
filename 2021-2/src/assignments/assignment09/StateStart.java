package assignments.assignment09;

public class StateStart implements State {
	CalcV1 calcv1;

	public StateStart(CalcV1 calcv1) {
		this.calcv1 = calcv1;
	}
	
	@Override
	public void printOutResult() {}

	@Override
	public void processNumber(String ch) {
		calcv1.setOperand1(Integer.parseInt(ch));
		calcv1.setState(calcv1.getStateFirstOperand());
	}

	@Override
	public void processOperator(char ch) {}
}
