package exercises.week12;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gbMachine) {
		gumballMachine = gbMachine;
	}
	
	public void insertQuarter() {
		System.out.println("매진되었습니다");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	public void ejectQuarter() {
		System.out.println("매진되었습니다");
	}
	
	public void turnCrank() {
		System.out.println("매진되었습니다");
	}
	
	public void dispense() {
		System.out.println("매진되었습니다");
	}
}
