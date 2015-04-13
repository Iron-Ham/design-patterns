package delegation2;

/**
 * The sample program requests a project contractor to
 * perform the four tasks of a software project.
 *
 */

public class Main {

	public static void main(String[] args) {
		SoftwareDevelopment developer = new ProjectContractor();
		developer.specification();
		developer.design();
		developer.coding();
		developer.testing();
	}

}
