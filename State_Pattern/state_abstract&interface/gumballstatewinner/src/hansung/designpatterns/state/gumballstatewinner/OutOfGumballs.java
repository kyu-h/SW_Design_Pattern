package hansung.designpatterns.state.gumballstatewinner;

public class OutOfGumballs implements State {
    GumballMachine gumballMachine;

    public OutOfGumballs(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {} // count = 0

    public void ejectQuarter() {} // count = 0

    public void turnCrank() {} // count = 0

    public void dispense() {
        System.out.println("You got the last gumball you have to refill!!!");
    }

    public void refill(int gumballs) {}

    public String toString() {
        return "out of number, so refilled it";
    }
}
