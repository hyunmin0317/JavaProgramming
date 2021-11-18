package assignments.assignment09;

import java.util.Scanner;

public class CalcV1 {
    Scanner scanner;
    String inputStr;
    int operand1; // 첫 번째 피 연산자값 저장
    int operand2; // 두 번째 피 연산자값 저장
    char operator; // 사칙 연산자 저장
    
    State stateStart;
    State stateFirstOperand;
    State stateSecondOperand;
    State stateOperator;
    State state;

    CalcV1() {
        scanner = new Scanner(System.in);  // Create a Scanner object
        stateStart = new StateStart(this);
        stateFirstOperand = new StateFirstOperand(this);
        stateSecondOperand = new StateSecondOperand(this);
        stateOperator = new StateOperator(this);
        state = stateStart;
    }

    String getInput(String s) {
        System.out.println(s);
        return scanner.next();
    }

    void printOutResult() {
        state.printOutResult();
    }

    /* 정수가 입력되었을 때 처리 */
    void processNumber(String ch) {
        state.processNumber(ch);
    }

    /* 사칙 연산자 혹은 = 연산자 처리 */
    void processOperator(char ch) {
    	state.processOperator(ch);
    }

    /* 프로그램의 주 로직을 담당하는 함수
       사용자 입력을 기다렸다가 q 또는 Q가 입력되면 종료
       그렇지 않으면 정수가 입력되었는지 혹은 연산자가 입력되었는지에 따라 processNumber 또는 processOperator 함수를 호출
     */
    boolean run() {
        inputStr = getInput("정수 또는 +,-,*,/,= 기호 중 한 개를 입력하세요");
        char ch = inputStr.charAt(0);
        if (ch == 'q' || ch == 'Q') { // q를 입력하면 프로그램 종료
            return false;
        }
        else if (ch >= '0' && ch <= '9') { // 정수가 입력되면
            processNumber(inputStr);
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') { // 연산자 처리
            processOperator(ch);
        }
        return true;
    }

	public void setState(State state) {	this.state = state; }
	
	public State getStateStart() { return stateStart; }

	public State getStateFirstOperand() { return stateFirstOperand; }

	public State getStateSecondOperand() { return stateSecondOperand; }

	public State getStateOperator() { return stateOperator; }

	public int getOperand1() { return operand1; }

	public int getOperand2() { return operand2; }

	public char getOperator() { return operator; }

	public void setOperand1(int operand1) { this.operand1 = operand1; }

	public void setOperand2(int operand2) { this.operand2 = operand2; }

	public void setOperator(char operator) { this.operator = operator; }
}
