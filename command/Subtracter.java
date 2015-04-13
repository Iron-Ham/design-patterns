package command;

public class Subtracter {

	double number1, number2;
	
	public Subtracter(double x, double y) {
		number1 = x;
		number2 = y;
	}
	
	public double subtract() {
		return number1 - number2;
	}
}
