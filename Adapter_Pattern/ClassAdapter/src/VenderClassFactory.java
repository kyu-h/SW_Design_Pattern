public class VenderClassFactory {
		private static VenderClassFactory instance;
		
		private VenderClassFactory() {}
		
		public static VenderClassFactory getInstance() {
			if (instance == null)
				instance = new VenderClassFactory();
			return instance;
		}
		
		public VenderClassInterface createVenderClass() {

			//return new VenderClass();
			return new VenderClassCAdapter();
		}
}
