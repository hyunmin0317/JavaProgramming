package exercises.week11;

public class NoCommand implements Command {
	public void execute() {
		System.out.println("No Command\n");
	}

	public void undo() {
		System.out.println("No Command\n");
	}
}