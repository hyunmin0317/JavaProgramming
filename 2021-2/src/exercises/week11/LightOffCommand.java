package exercises.week11;

public class LightOffCommand implements Command {
	Light light; // light 객체가 Receiver가 됨

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
