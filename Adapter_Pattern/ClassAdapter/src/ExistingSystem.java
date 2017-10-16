public class ExistingSystem {

	public static void main(String[] args) {
		//VenderClassInterface vender = new VenderClass();
		//VenderClassInterface vender = new VenderClassCAdapter();

		VenderClassInterface vender = VenderClassFactory.getInstance().createVenderClass();
		vender.request();
	}

}
