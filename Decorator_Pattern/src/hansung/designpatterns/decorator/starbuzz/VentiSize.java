package hansung.designpatterns.decorator.starbuzz;

public class VentiSize extends Size {

    public VentiSize(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 벤티 사이즈";
    }

    public double cost() {
        return .30 + beverage.cost();
    }
}

