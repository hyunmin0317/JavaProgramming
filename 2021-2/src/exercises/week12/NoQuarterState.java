package exercises.week12;
public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gbMachine) {
		gumballMachine = gbMachine;
	}
	
	public void insertQuarter() {
		System.out.println("동전을 넣으셨습니다");
		gumballMachine.setState(
		gumballMachine.getHasQuarterState());
	}
	
	public void ejectQuarter() {
		System.out.println("동전을 넣어주세요");
	}
	
	public void turnCrank() {
		System.out.println("동전을 넣어주세요");
	}
	
	public void dispense() {
		System.out.println("동전을 넣어주세요");
	}
}
