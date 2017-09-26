package hansung.designpatterns.decorator.starbuzz;

public class TallSize extends Size {

    public TallSize(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 톨사이즈";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
