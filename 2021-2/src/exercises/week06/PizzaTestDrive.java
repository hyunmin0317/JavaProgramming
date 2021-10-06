package exercises.week06;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore(new NYStyleCheesePizza());
		PizzaStore chicagoStore = new ChicagoPizzaStore(new NYStyleCheesePizza());
		Pizza pizza = nyStore.orderPizza("cheese");

		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
