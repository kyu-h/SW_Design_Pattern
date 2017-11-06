package hansung.designpatterns.templatemethod.barista;


public class Tea extends CaffeineBeverage {
	public void brew() {
		System.out.println("Steeping the tea");
	}
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
	public void ripen(){}

	@Override
	void boilWater() {
		System.out.println("Boiling water");
	}
}
