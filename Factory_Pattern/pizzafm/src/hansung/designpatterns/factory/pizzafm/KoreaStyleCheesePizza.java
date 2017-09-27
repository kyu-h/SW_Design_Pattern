package hansung.designpatterns.factory.pizzafm;

public class KoreaStyleCheesePizza extends Pizza {

    public KoreaStyleCheesePizza() {
        name = "Korea Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
