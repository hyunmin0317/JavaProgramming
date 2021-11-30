package answers.assignment09;

public interface State {
	default public void processNumber(int num) {
		System.out.println("processNumber: Invalid operation");
	}
	default public void processOperator(char op) {
		System.out.println("processOperator: Invalid operation");
	}
}
