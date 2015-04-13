package adapter;

/**
 * This class shows the adapter design pattern.
 * It provides the application an interface
 * from the existing interface.
 * 
 * That is, this adaptor provides a different
 * voltage of power supply.
 *
 */

public class PowerAdapter implements PowerSupply
{
    private WallSocket socket;
    
    public PowerAdapter() {
    	socket = new WallSocket();
    }
    
	public int getPower() {
	    int power = socket.getPower();
	    power = (int)(2*Math.sqrt(power)) - 1;
	    return power;
	}
}
