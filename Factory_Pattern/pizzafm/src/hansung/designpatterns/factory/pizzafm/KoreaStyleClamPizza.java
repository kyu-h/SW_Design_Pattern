package hansung.designpatterns.factory.pizzafm;

public class KoreaStyleClamPizza extends Pizza {
    public KoreaStyleClamPizza() {
        name = "Korea Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
