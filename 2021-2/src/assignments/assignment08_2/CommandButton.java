package assignments.assignment08_2;

import javax.swing.JButton;

public abstract class CommandButton extends JButton implements Command {
	protected Calculator calculator;
	
	public CommandButton(String name, Calculator calculator) {
		super(name);
		this.calculator = calculator;
	}
	
	public Calculator getCalculator() { return calculator; }

	@Override
	public abstract void execute();
}
