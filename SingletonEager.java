package Part1;

/** Singleton "Eager"
 * @see <a href="https://github.com/AMANDASALOMAO">Referencia</a>
 * 
 * @author Amanda
 */

public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getinstancia() {
		return instancia;
	}
}


