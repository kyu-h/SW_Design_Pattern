package hansung.designpatterns.decorator.starbuzz;

public class Banila extends CondimentDecorator {

    public Banila(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 바닐라";
    }

    public double cost() {
        return .30 + beverage.cost();
    }
}
