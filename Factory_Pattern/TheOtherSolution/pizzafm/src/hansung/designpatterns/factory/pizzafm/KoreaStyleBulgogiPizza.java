package hansung.designpatterns.factory.pizzafm;

public class KoreaStyleBulgogiPizza extends Pizza {
		public KoreaStyleBulgogiPizza() {
			name = "Korea Style Bulgogi Pizza";
			dough = "Thin Crust Cheese Dough";
			sauce = "Bulgogi Sauce";
	 
			toppings.add("Shredded Chedda Cheese");
			toppings.add("Frozen Clams from Chesapeake Bay");
			toppings.add("Grilled Bulgogi");
		}
	 
		void cut() {
			System.out.println("Cutting the pizza into square slices");
		}
		
		void box() {
			System.out.println("Place pizza in official BulgogiMark box");
		}
	}
