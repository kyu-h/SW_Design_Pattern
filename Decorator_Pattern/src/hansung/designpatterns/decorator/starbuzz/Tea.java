package hansung.designpatterns.decorator.starbuzz;

public class Tea extends Beverage {

    public Tea() {
        description = "티";
    }

    public double cost() {
        return 2.99;
    }
}
