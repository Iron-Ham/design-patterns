package command;

public class SubtractCommand implements Command {

		Subtracter sub;
		
		public SubtractCommand(Subtracter b) {
			sub = b;
		}
		
		@Override
		public void execute() {
			double value = sub.subtract();
			System.out.printf("Subtract result = %.2f\n", value);
		}
}
