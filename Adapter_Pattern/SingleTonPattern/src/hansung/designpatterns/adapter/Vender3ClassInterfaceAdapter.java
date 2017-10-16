package hansung.designpatterns.adapter;

public class Vender3ClassInterfaceAdapter implements VenderClassInterface {
    Vender3Class vender;

    public Vender3ClassInterfaceAdapter(Vender3Class vender) {
        this.vender = vender;
    }

    public void request(){
        vender.specificRequest3();
    }
}
