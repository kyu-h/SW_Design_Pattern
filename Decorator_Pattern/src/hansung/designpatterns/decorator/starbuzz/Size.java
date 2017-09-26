package hansung.designpatterns.decorator.starbuzz;

public abstract class Size extends Beverage {
    protected Beverage beverage;

    public Size(Beverage beverage) {
        this.beverage = beverage;
    }
}
