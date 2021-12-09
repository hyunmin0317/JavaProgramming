package exercises.week12;
public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	State state;
	
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		state = soldOutState;
		this.count = numberGumballs;
		if (numberGumballs > 0 ) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot…");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	public int getCount() { return count; } 
	
	public State getState() { return state; }
	
	public State getSoldOutState() { return soldOutState; } 
	
	public State getNoQuarterState() { return noQuarterState; } 
	
	public State getHasQuarterState() { return hasQuarterState; } 
	
	public State getSoldState() { return soldState; }
	
	public State getWinnerState() { return winnerState; }

	@Override
	public String toString() {
		return "GumballMachine [soldOutState=" + soldOutState + ", noQuarterState=" + noQuarterState
				+ ", hasQuarterState=" + hasQuarterState + ", soldState=" + soldState + ", state=" + state + ", count="
				+ count + "]";
	}	
}
