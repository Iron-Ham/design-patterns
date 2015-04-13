package facade;

/**
 * A flight agent that returns a list of available flights
 */

import java.util.List;
import java.util.ArrayList;

public class FlightBooker {

	public List<Flight> getFlights() {
		List<Flight> flights = new ArrayList<Flight>();
		flights.add(new Flight(372, "DTW", "ORD"));
		flights.add(new Flight(209, "DTW", "LAX"));
		flights.add(new Flight(209, "DTW", "DCA"));
		return flights;
	}
}
