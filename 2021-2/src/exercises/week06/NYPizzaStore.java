package exercises.week06;

public class NYPizzaStore extends PizzaStore {
	public NYPizzaStore(Pizza pizza) {
		super(pizza);
	}

	Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
			}
		return pizza;
		}
}
