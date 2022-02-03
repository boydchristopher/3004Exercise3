import java.util.Scanner;


public class mainClass {

	public static void main(String[] args) throws Exception {
		Scanner x = new Scanner(System.in);
		Table t = new Table();  //each table keeps track of the pizza or pizzas served on it.  
	        //The table is used purely to output the details of the ordered pizza.

		System.out.println("Pick (1) to order a veggie pizza (13$) or (2) to order a steak and pepperoni pizza (15$)? You have 14 dollars in the bank!");
		//Notice that, for simplicity, the price of a pizza is the same regardless of its size and crust type!!

		String input = x.nextLine();

		PizzaStrategy pzs = new pizzaStrategy1();  //topping are  Mushrooms, Onions, Green Peppers and Black Olives

		if (input.equals("2")) {
			pzs = new pizzaStrategy2();  //topping are  Steak and Pepperoni
		}

		Pizza p = new Pizza(pzs, "Large", "Thin", t);

		System.out.println("What size do you want? Small(1) Large(2)?");
		input = x.nextLine();
		if (input.equals("1")) {
			p.size = "Small";
		} else {
			p.size = "Large";
		}
		System.out.println("What crust do you want? Thin(1) Thick(2)?");
		input = x.nextLine();
		if (input.equals("1")) {
			p.crust = "Thin";
		} else {
			p.crust = "Thick";
		}

		System.out.println("How would you like to pay? Debit(1) Credit(2)?");
		input = x.nextLine();
		if (input.equals("1")) {
			PaymentStrategy ps = new Debit();
			if (ps.pay(p, 14) >= 0) {
				t.toString(p);
			}
		} else if (input.equals("2")) {
			PaymentStrategy ps = new Credit();
			ps.pay(p, 14);
			t.toString(p);
		}

		x.close();
	}
}
