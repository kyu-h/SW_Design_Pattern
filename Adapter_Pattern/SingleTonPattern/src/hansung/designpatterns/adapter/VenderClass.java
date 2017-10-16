package hansung.designpatterns.adapter;

public class VenderClass implements VenderClassInterface{
    public void request() {
        System.out.println("Original Vender class request 1 is served");
    }
}