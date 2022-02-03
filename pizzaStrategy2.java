
public class pizzaStrategy2 implements PizzaStrategy
{

	@Override
	public boolean order(Pizza p) {

		p.toppings.add("Pepperoni");
		p.toppings.add("Steak");

		p.table.served.add(p);

		p.cost = 15;

		return true;
	}

}