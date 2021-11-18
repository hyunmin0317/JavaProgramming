package exercises.week12;

import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	Random random = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gbMachine) {
		gumballMachine = gbMachine;
	}
	
	public void insertQuarter() {
		System.out.println("동전은 한 개만 넣어주세요");
	}
	
	public void ejectQuarter() {
		System.out.println("동전이 반환됩니다");
		gumballMachine.setState(
		gumballMachine.getNoQuarterState());
	}
	
	public void turnCrank() {
		System.out.println("손잡이를 돌리셨습니다");
		int winner = random.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(
			gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(
			gumballMachine.getSoldState());
		}
	}
	
	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다");
	}
}
