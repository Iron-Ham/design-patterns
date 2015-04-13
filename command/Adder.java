package command;

public class Adder {
	
	double number1, number2;
	
	public Adder(double x, double y) {
		number1 = x;
		number2 = y;
	}
	
	public double add() {
		return number1 + number2;
	}
}
