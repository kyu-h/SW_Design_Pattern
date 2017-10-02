package hansung.designpatterns.factory.pizzaaf;

public class KoreaPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new KoreaPizzaIngredientFactory();

		if (item.equals("kimchi")) {

			pizza = new KimchiPizza(ingredientFactory);
			pizza.setName("Korea Style Kimchi Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Korea Style Veggie Pizza");

		} else if (item.equals("bulgogi")) {

			pizza = new BulgogiPizza(ingredientFactory);
			pizza.setName("Korea Style Bulgogi Pizza");

		} else if (item.equals("pumpkin")) {

			pizza = new PumpkinPizza(ingredientFactory);
			pizza.setName("Korea Style Pumpkin Pizza");

		}
		return pizza;
	}
}
