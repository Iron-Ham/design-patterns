package singleton;

/**
 * Create an array of singleton objects and set the value
 * of the first element in the array. All other elements
 * in the array are also set, simply because they all
 * refer to the same object.
 *
 */

public class App {

	public static void main(String[] args) {
		Singleton[] objs = new Singleton[5];
		for (int i = 0; i < objs.length; i++)
			objs[i] = Singleton.getInstance();
		
		objs[0].setValue(17);
		
		for (int i = 1; i < objs.length; i++)
			System.out.printf("objs[%d] = %d\n", i, objs[i].getValue());
	}
}
