package hansung.designpatterns.factory.pizzafm;

public class KoreaStylePepperoniPizza extends Pizza {

    public KoreaStylePepperoniPizza() {
        name = "Korea Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
