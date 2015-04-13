package facade;

/**
 * A flight has a flight number, departure
 * airport and arrival airport.
 *
 */

public class Flight {
	
	private int flightNo;
	private String departPort, arrivalPort;
	
	public Flight(int num, String dep, String arr) {
		flightNo = num;
		departPort = dep;
		arrivalPort = arr;
	}
	
	public String toString() {
		return String.format("%4d%10s%10s", flightNo, departPort, arrivalPort);
	}
}
