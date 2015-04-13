package facade;

/**
 * This facade class shields the hotel/flight agents
 * from the application, and provides a unified
 * interface.
 */

import java.util.List;

public class TravelFacade {
	
	private HotelBooker hBooker;
	private FlightBooker fBooker;
	
	public TravelFacade() {
		hBooker = new HotelBooker();
		fBooker = new FlightBooker();
	}
	
	public void getHotelsAndFlights() {
		List<Hotel> hotels = hBooker.getHotels();
		List<Flight> flights = fBooker.getFlights();
		show(hotels, flights);
	}
	
	private void show(List<Hotel> hotels, List<Flight> flights) {
		System.out.println("Hotels:");
		for (Hotel h :hotels)
			System.out.println(h);
		System.out.println("\nFlights:");
		for (Flight f: flights)
			System.out.println(f);
	}

}
