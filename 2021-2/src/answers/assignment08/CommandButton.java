package answers.assignment08;

import javax.swing.JButton;

public abstract class CommandButton extends JButton implements Command {
	private Calculator calculator;
	
	public CommandButton(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public Calculator getCalculator() { return calculator; }

	@Override
	public abstract void execute();
}
