package delegation;

public class DelegateB implements AnInterface {

	@Override
	public void f() {
		System.out.println("Done by B.");
	}

}
