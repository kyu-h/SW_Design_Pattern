package hansung.designpatterns.templatemethod.barista;


public class BeverageTestDrive {
	public static void main(String[] args) {

		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		DutchCoffee dutchcoffee = new DutchCoffee();

		System.out.println("\nMaking tea...");
		tea.prepareRecipe();

		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

		System.out.println("\nMaking dutch coffee...");
		dutchcoffee.prepareRecipe();


		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		DutchCoffeeHook dutchhook = new DutchCoffeeHook();


		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();

		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();

		System.out.println("\nMaking dutch coffee...");
		dutchhook.prepareRecipe();
	}
}
