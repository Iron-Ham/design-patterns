package delegation;

/**
 * The class is a delegate that actually perform
 * the operation f() specified in the interface.
 *
 */

public class DelegateA implements AnInterface {

	@Override
	public void f() {
		System.out.println("Done by A.");
	}

}
