package command;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double x, y;
		System.out.print("Enter two numbers: ");
		x = stdin.nextDouble();
		y = stdin.nextDouble();
		
		// receiver
		Adder adder = new Adder(x, y);
		// concrete command
		Command command1 = new AddCommand(adder);
		// invoker
		Invoker invoker = new Invoker(command1);
		// invoke the action
		invoker.invoke();
		
		// receiver
		Subtracter sub = new Subtracter(x, y);
		// concrete command
		Command command2 = new SubtractCommand(sub);
		// reset the command
		invoker.setCommand(command2);
		// invoke the action
		invoker.invoke();

	}

}
