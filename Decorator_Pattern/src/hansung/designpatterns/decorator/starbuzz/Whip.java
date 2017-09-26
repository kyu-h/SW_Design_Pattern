package hansung.designpatterns.decorator.starbuzz;
 
public class Whip extends CondimentDecorator {
	String liquid = beverage.getDescription();
	String[] strings = liquid.split(",");
 
	public Whip(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		for(int i=0; i<strings.length; i++){
			if(strings[i].equals("티")) {
				return beverage.getDescription();
			}
		}
		return beverage.getDescription() + ", 휘핑";
	}
 
	public double cost() {
		for(int i=0; i<strings.length; i++){
			if(strings[i].equals("티")) {
				return beverage.cost();
			}
		}
		return .10 + beverage.cost();
	}
}
