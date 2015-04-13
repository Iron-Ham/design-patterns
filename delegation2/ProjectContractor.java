package delegation2;

/**
 * A project contractor delegates the software development
 * tasks to other classes.
 * 
 * This design illustrates the "delegation design pattern."
 *
 */

public class ProjectContractor implements SoftwareDevelopment {

	RequirementsCollector collector;
	Designer designer;
	Coder coder;
	Tester tester;
	
	ProjectContractor() {
		collector = new RequirementsCollector();
		designer = new Designer();
		coder = new Coder();
		tester = new Tester();
	}
	
	@Override
	public void specification() {
		collector.specification();
	}

	@Override
	public void design() {
		designer.design();	
	}

	@Override
	public void coding() {
		coder.coding();
	}

	@Override
	public void testing() {
		tester.testing();
	}

}
