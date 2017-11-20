package hansung.designpatterns.state.gumball;

import java.util.Random;

public class GumballMachine {
 
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	final static int REFILL = 4;
	final static int WINNER = 5;
 
	int state = SOLD_OUT;
	int count = 0;

	Random randomWinner = new Random(System.currentTimeMillis());
  
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
  
	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, the machine is sold out");
		} else if (state == SOLD) {
        	System.out.println("Please wait, we're already giving you a gumball");
		} else if (state == REFILL) {

		}
	}

	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");
		} else if (state == SOLD) {
			System.out.println("Sorry, you already turned the crank");
		} else if (state == SOLD_OUT) {
        	System.out.println("You can't eject, you haven't inserted a quarter yet");
		} else if (state == REFILL) {

		}
	}
 
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("Turning twice doesn't get you another gumball!");
		} else if (state == NO_QUARTER) {
			System.out.println("You turned but there's no quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You turned, but there are no gumballs");
		} else if (state == HAS_QUARTER) {
			System.out.println("You turned...");

			int winner = randomWinner.nextInt(10);
			if((winner == 0) && (count > 1)) {
				state = WINNER;
				dispense();
			}else {
				state = SOLD;
				dispense();
			}

			/*state = SOLD;
			dispense();*/
		} else if (state == REFILL) {

		}
	}
 
	private void dispense() {
		if (state == SOLD) {
			System.out.println("A gumball comes rolling out the slot");
			if(count != 0){
				count = count - 1;
			}
			if(count > 0){
				state = NO_QUARTER;
			}else if (count == 0){
				state = REFILL;
			}else {
				System.out.println("Oops, out of gumballs!");
				state = SOLD_OUT;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if (state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		} else if (state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		} else if (state == REFILL) {
			System.out.println("You got the last gumball you have to refill!!!");
		} else if (state == WINNER) {
			System.out.println("A gumball comes rolling out the slot");
			if(count != 0){
				count = count - 1;
			}
			if(count == 0){
				state = SOLD_OUT;
			}else {
				if(count != 0){
					count = count - 1;
				}
				System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
				if(count > 0){
					state = NO_QUARTER;
				}else {
					System.out.println("Oops, out of gumballs!");
					state = SOLD_OUT;
				}
			}
		}
	}
 
	public void refill(int numGumBalls) {
		if(count == 0){
			this.count = numGumBalls;
			state = REFILL;
		}
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("Inventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\nMachine is ");
		if (state == SOLD_OUT) {
			result.append("sold out");
		} else if (state == NO_QUARTER) {
			result.append("waiting for quarter");
		} else if (state == HAS_QUARTER) {
			result.append("waiting for turn of crank");
		} else if (state == SOLD) {
			result.append("delivering a gumball");
		} else if (state == REFILL) {
			result.append("out of number, so refilled it");
		} else if (state == WINNER) {
			result.append("despensing two gumballs for your quarter, because YOU'RE A WINNER!");
		}
		result.append("\n");
		return result.toString();
	}
}


