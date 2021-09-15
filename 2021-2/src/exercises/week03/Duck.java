package exercises.week03;

public class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public void swim() {
		System.out.println("swim");
	}
	
	public void display() {
		System.out.println("Duck");
	}
	
	public void performQuack() {
		if (quackBehavior != null) {
			quackBehavior.quack();
		}
	}
	
	public void performFly() {
		if (flyBehavior != null) {
			flyBehavior.fly();
		}
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}
