package hansung.designpatterns.decorator.starbuzz;

public class Syrup extends CondimentDecorator {

    public Syrup(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 카라멜 시럽";
    }

    public double cost() {
        return .40 + beverage.cost();
    }
}
