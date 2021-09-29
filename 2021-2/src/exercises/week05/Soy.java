package exercises.week05;
public class Soy extends CondimentDecorator {
	Beverage beverage; 
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 소이";
	}

	public double cost() {
		return beverage.cost() + .30;
	}
}