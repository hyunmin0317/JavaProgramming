package exam.final2019;

import javax.swing.JButton;

public class CommandButton extends JButton implements Command {
	Calculator calculator;
	
	public CommandButton(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	@Override
	public void execute() {
	}
}
