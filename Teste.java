package Part1;

public class Teste {

	public static void main(String[] args) {
		
		//Testes relacionados ao Design Patter Singleton:
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getinstancia();
		System.out.println(eager);
		eager = SingletonEager.getinstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getinstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getinstancia();
		System.out.println(lazyHolder);
	}
}
