package exercises.week03;

public class RubberDuck extends Duck {
	public RubberDuck() {
		setQuackBehavior(new Squeak());
		setFlyBehavior(new FlyNoway());
	}

	@Override
	public void display() {
		System.out.println("Rubber Duck");
	}
}
