package composite;

/**
 * A special holiday gift class.
 * 
 */

public class Toy implements HolidayGift
{
    private String name;
    
    public Toy(String name) {
    	this.name = name;
    }
    
	public void display() {
	    System.out.printf("%-8s%s\n", "Toy:", name);
	}
}
