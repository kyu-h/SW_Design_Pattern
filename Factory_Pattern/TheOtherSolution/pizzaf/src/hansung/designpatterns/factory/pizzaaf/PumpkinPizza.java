package hansung.designpatterns.factory.pizzaaf;

public class PumpkinPizza extends Pizza {
	public PumpkinPizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
		// TODO Auto-generated constructor stub
	}

	
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}

