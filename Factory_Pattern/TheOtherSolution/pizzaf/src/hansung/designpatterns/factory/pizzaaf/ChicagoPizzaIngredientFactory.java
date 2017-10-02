package hansung.designpatterns.factory.pizzaaf;


public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
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
