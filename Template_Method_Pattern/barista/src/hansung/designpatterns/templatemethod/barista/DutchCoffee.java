package hansung.designpatterns.templatemethod.barista;

public class DutchCoffee extends CaffeineBeverage{

    public void brew() {
        System.out.println("It takes a long time for extract coffee with cold water");
    }

    public void ripen() {
        System.out.println("Low temperature ripen in a day or two");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    void boilWater(){}

}
