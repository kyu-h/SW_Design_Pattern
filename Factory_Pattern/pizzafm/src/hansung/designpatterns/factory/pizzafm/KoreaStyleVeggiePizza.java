package hansung.designpatterns.factory.pizzafm;

public class KoreaStyleVeggiePizza extends Pizza {

    public KoreaStyleVeggiePizza() {
        name = "Korea Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
