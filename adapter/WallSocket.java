package adapter;

/**
 * The power supply from the wall socket is 110v.
 * This is adaptee.
 *
 */

public class WallSocket implements PowerSupply
{
	int power;
	
	public WallSocket() {
		power = 110;
	}
	
	public int getPower() {
		return power;
	}
}
