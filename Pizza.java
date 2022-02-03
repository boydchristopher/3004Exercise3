
import java.util.ArrayList;

public class Pizza {
	
Table table;  //the table at which this pizza is served
 
public String size;
public String crust;
public ArrayList<String> toppings=new ArrayList<String>();
public int cost;

public Pizza(PizzaStrategy strategy, String size, String crust, Table t) {
	
	this.size = size;
	this.crust = crust;
	this.table = t;
	this.cost = 0;
	//hint: missing code here to order via the pizza strategy
	strategy.order(this);
}

}
