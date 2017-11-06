package hansung.designpatterns.templatemethod.barista;


public abstract class CaffeineBeverage {
  
	final void prepareRecipe() {
		boilWater();
		brew();
		ripen();
		pourInCup();
		addCondiments();
	}
 
	abstract void brew();
  
	abstract void addCondiments();

	abstract void ripen();

	abstract void boilWater();
  
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
