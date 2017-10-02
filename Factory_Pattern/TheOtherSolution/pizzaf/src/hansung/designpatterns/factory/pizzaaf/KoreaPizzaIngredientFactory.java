package hansung.designpatterns.factory.pizzaaf;


public class KoreaPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new ChedaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant(),
				new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
	
	public Kimchi createKimchi() {
		return new FreshKimchi();
	}
	
	public Bulgogi createBulgogi() {
		return new GrilledBulgogi();
	}
	
	public Pumpkin createPumpkin() {
		return new DryPumpkin();
	}
}