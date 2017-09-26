package hansung.designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
	String liquid = beverage.getDescription();
	String[] strings = liquid.split(",");

	public Mocha(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		for(int i=0; i<strings.length; i++){
			if(strings[i].equals("티")) {
				return beverage.getDescription();
			}
		}
		return beverage.getDescription() + ", 모카";
	}
 
	public double cost() {
		for(int i=0; i<strings.length; i++){
			if(strings[i].equals("티")) {
				return beverage.cost();
			}
		}
		return .20 + beverage.cost();
	}
}
