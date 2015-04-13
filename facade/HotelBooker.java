package facade;

/**
 * A hotel agent that returns a list of available hotels
 *
 */

import java.util.List;
import java.util.ArrayList;

public class HotelBooker {

	public List<Hotel> getHotels() {
		List<Hotel> hotels = new ArrayList<Hotel>();
		hotels.add(new Hotel("Holiday Inn"));
		hotels.add(new Hotel("Marriott"));
		return hotels;
	}
	
}
