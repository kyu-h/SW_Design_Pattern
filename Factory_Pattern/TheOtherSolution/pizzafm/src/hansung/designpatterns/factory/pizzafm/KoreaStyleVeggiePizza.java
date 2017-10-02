package hansung.designpatterns.factory.pizzafm;

public class KoreaStyleVeggiePizza extends Pizza {
	public KoreaStyleVeggiePizza() {
		name = "Korea Deep Dish Veggie Pizza";
		dough = "Thick Crust Dough";
		sauce = "Sweet onion Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
