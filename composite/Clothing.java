package composite;

/**
 * A special holiday gift class.
 * 
 */

public class Clothing implements HolidayGift
{
	private String brand;
	
    public Clothing(String brand) {
    	this.brand = brand;
    }
    
	public void display() {
	    System.out.printf("%-8s%s\n", "Cloth:", brand);
	}
}
