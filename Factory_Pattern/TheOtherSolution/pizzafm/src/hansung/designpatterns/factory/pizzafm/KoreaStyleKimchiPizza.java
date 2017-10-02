package hansung.designpatterns.factory.pizzafm;

public class KoreaStyleKimchiPizza extends Pizza {

	public KoreaStyleKimchiPizza() { 
		name = "Korea Style Deep Dish Kimchi Pizza";
		dough = "Kimchi Dough";
		sauce = "Kimchi Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Fried Kimchi");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
	void box() {
		System.out.println("Place pizza in official KimchiMark box");
	}
}
