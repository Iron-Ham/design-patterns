package composite;

/**
 * This class represents composite objects.
 * 
 */

import java.util.List;
import java.util.Vector;

public class GiftBox implements HolidayGift
{
	private List<HolidayGift> box = new Vector<HolidayGift>();
	
	public void add(HolidayGift gift) {
		box.add(gift);
	}
	
	public void remove(HolidayGift gift) {
		box.remove(gift);
	}
	
	public void display() {
	    System.out.println("----- Your gift box -------");
	    for (HolidayGift gift : box)
	        gift.display();
	    System.out.println("---------------------------");
	}
}
