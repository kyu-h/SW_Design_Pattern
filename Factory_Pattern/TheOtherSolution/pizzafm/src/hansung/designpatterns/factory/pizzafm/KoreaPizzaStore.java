package hansung.designpatterns.factory.pizzafm;

public class KoreaPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("kimchi")) {
            		return new KoreaStyleKimchiPizza();
        	} else if (item.equals("veggie")) {
        	    	return new KoreaStyleVeggiePizza();
        	} else if (item.equals("bulgogi")) {
        	    	return new KoreaStyleBulgogiPizza();
        	} else if (item.equals("pumpkin")) {
            		return new KoreaStylePumpkinPizza();
        	} else return null;
	}
}
