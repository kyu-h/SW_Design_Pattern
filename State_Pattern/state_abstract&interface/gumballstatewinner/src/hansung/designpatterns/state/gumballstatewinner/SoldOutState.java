package hansung.designpatterns.state.gumballstatewinner;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        
    }
 
	public void insertQuarter() {
		
	}
 
	public void ejectQuarter() {
		
	}
 
	public void turnCrank() {
		
	}
 
	public void dispense() {
		
	}

	public void refill(int gumballs) {}
 
	public String toString() {
		return "sold out";
	}
}
