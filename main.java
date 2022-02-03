import java.util.Scanner;


public class main{

	public static void main(String[] args) throws Exception {
		Scanner x = new Scanner(System.in);
		Table t = new Table();  //each table keeps track of the pizza or pizzas served on it.  
	        //The table is used purely to output the details of the ordered pizza.

		System.out.println("Pick (1) to order a veggie pizza (13$) or (2) to order a steak and pepperoni pizza (15$)? You have 14 dollars in the bank!");
		//Notice that, for simplicity, the price of a pizza is the same regardless of its size and crust type!!!
	

		Pizza p1 = new Pizza(new pizzaStrategy1(), "Large", "Thin", t, 13);  //topping are  Mushrooms, Onions, Green Peppers and Black Olives
		Pizza p2 = new Pizza(new pizzaStrategy2(), "Large", "Thin", t, 15);  //topping are  Steak and Pepperoni

		String input = x.nextLine();
		if (input.equals("1")) {
			System.out.println("What size do you want? Small(1) Large(2)?");
			input = x.nextLine();
			if (input.equals("1")) {
				p1.size = "Small";
			} else {
				p1.size = "Large";
			}
			System.out.println("What crust do you want? Thin(1) Thick(2)?");
			input = x.nextLine();
			if (input.equals("1")) {
				p1.crust = "Thin";
			} else {
				p1.crust = "Thick";
			}

			System.out.println("How would you like to pay? Debit(1) Credit(2)?");
			input = x.nextLine();
			if (input.equals("1")) {
				PaymentStrategy ps = new Debit();
				if (ps.pay(p1, 14) >= 0) {
					t.toString(p1);
				}
			} else if (input.equals("2")) {
				PaymentStrategy ps = new Credit();
				ps.pay(p1, 14);
				t.toString(p1);
			}

		}
		if (input.equals("2")) {
			System.out.println("What size do you want? Small(1) Large(2)?");
			input = x.nextLine();
			if (input.equals("1")) {
				p2.size = "Small";
			} else {
				p2.size = "Large";
			}
			System.out.println("What crust do you want? Thin(1) Thick(2)?");
			input = x.nextLine();
			if (input.equals("1")) {
				p2.crust = "Thin";
			} else {
				p2.crust = "Thick";
			}
			System.out.println("How would you like to pay? Debit(1) Credit(2)?");
			input = x.nextLine();
			if (input.equals("1")) {
				PaymentStrategy ps = new Debit();
				if (ps.pay(p2, 14) >= 0) {
					t.toString(p2);
				}
			} else if (input.equals("2")) {
				PaymentStrategy ps = new Credit();
				ps.pay(p2, 14);
				t.toString(p2);
			}

		}
		x.close();
	}
}
