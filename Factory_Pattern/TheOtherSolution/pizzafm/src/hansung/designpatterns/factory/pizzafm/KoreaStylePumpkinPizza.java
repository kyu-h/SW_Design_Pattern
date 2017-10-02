package hansung.designpatterns.factory.pizzafm;

public class KoreaStylePumpkinPizza extends Pizza {
	public KoreaStylePumpkinPizza() {
		name = "Korea Style Pumpkin Pizza";
		dough = "Thin Crust Pumpkin Dough";
		sauce = "Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
		toppings.add("Grilled Bulgogi");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
