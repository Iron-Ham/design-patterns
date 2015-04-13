package singleton;

/**
 * Singleton design pattern.
 * 
 * The constructor of this class is private so no object
 * of this class can be created via constructor from outside
 * of the class.
 * 
 * This class can be instantiated only through method getInstance()
 * that always returns the same object, which is "final."
 *
 */

public class Singleton {
	
	private static final Singleton instance = new Singleton(); 
	private static int x;
	
	private Singleton() {
	}
	
	public static synchronized Singleton getInstance() {
		return instance;
	}
	
	public int getValue() {
		return x;
	}
	
	public void setValue(int a) {
		x = a;
	}
}
