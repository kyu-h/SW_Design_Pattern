package hansung.designpatterns.strategy;

public class FakeQuak implements QuackBehavior {
    public void quack() {
        System.out.println("Quak");
    }
}
