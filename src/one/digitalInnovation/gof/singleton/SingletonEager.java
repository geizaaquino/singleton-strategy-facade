package one.digitalInnovation.gof.singleton;

/**
 * Singleton "apressado".
 * @author Antonia
 *
 */

public class SingletonEager {
	private static SingletonEager instancia  = new   SingletonEager();
	
	private SingletonEager() {
		super(); 
		
	}
	public static SingletonEager getInstancia() {
		
		return instancia;
		
		
	}

}