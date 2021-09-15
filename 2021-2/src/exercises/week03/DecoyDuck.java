package exercises.week03;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setQuackBehavior(new MuteQuack());
		setFlyBehavior(new FlyNoway());
	}

	@Override
	public void display() {
		System.out.println("Decoy Duck");
	}
}
