package assignments.assignment03_2;

public class StopButtonCommand implements Command {
	private PrimeObservableThread primeThread;
	
	public StopButtonCommand(PrimeObservableThread primeThread) {
		this.primeThread = primeThread;
	}
	
	@Override
	public void execute() {
        primeThread.stopRunning();		
	}
}
