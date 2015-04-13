package facade;

/**
 * This application interfaces with a "travel agent"
 * to find available hotels and flights.
 *
 */

public class App {

	public static void main(String[] args) {
		TravelFacade facade = new TravelFacade();
		facade.getHotelsAndFlights();
	}
}
