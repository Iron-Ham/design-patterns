package delegation;

/**
 * The delegator delegates the operation f()
 * to two other classes to perform.
 *
 */

public class Delegator implements AnInterface {
	AnInterface a, b;
	
	Delegator() {
		a = new DelegateA();
		b = new DelegateB();
	}

	@Override
	public void f() {
		a.f();
		b.f();
	}
}
