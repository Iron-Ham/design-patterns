package command;

public class AddCommand implements Command {

	Adder adder;
	
	public AddCommand(Adder a) {
		adder = a;
	}
	
	@Override
	public void execute() {
		double value = adder.add();
		System.out.printf("Addition result = %.2f\n", value);
	}

}
