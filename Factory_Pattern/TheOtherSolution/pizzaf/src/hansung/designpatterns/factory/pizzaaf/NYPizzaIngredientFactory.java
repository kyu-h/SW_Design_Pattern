package hansung.designpatterns.factory.pizzaaf;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
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
