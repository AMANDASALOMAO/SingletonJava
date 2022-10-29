package Part1;

public class SingletonLazy {

	public static SingletonLazy instancia;
		
		private SingletonLazy() {
			super();
		}
		
		public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
		
	}

}
