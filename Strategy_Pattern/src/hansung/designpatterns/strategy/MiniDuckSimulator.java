package hansung.designpatterns.strategy;

import java.util.ArrayList;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		ArrayList<Duck> ducks = new ArrayList<Duck>();
		
		ducks.add(new MallardDuck());
		ducks.add(new RedheadDuck());
		ducks.add(new RubberDuck());
		ducks.add(new DecoyDuck());
		ducks.add(new ModelDuck());
		
		for (Duck d: ducks) {
			d.display();
			d.swim();
			if (d instanceof ModelDuck){
				d.setFlyBehavior(new FlyRocketPowered());
				d.setQuackBehavior(new FakeQuak());
			}else if (d instanceof RubberDuck){
				d.setQuackBehavior(new FakeQuak());
			}
            d.performQuack();
			d.performFly();
			System.out.println();
		}

	}

}
