package hansung.designpatterns.adapter;

public class VenderClassInterfaceAdapter implements VenderClassInterface {
	Vender2Class vender;
	
	public VenderClassInterfaceAdapter(Vender2Class vender) {
		this.vender = vender;
	}
	
	public void request() {
		vender.specificRequest();
	}

}
