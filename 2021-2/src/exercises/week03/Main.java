package exercises.week03;

public class Main {
	public static void main(String[] args) {
		Duck duck1 = new MallardDuck();
		duck1.display();
		duck1.performQuack();
		duck1.performFly();
		
		Duck duck2 = new RubberDuck();
		duck2.display();
		duck2.performFly();
		duck2.performQuack();
		duck2.setFlyBehavior(new FlyNoway());
		duck2.performFly();
		
		Duck duck3 = new DecoyDuck();
		duck3.display();
		duck3.performFly();
		duck3.performQuack();
	}
}
