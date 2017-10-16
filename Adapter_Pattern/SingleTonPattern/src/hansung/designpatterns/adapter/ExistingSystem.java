package hansung.designpatterns.adapter;

public class ExistingSystem {

	public static void main(String[] args) {
		//VenderClass vender = new VenderClass();

		//VenderClassInterface vender = new VenderClass();
		//VenderClassInterface vender = new VenderClassInterfaceAdapter(new Vender2Class());

		VenderClassInterface vender = VenderClassFactory.getInstance().createVenderClass();

		vender.request();
	}

}
