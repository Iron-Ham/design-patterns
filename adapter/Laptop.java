package adapter;

/**
 * A laptop computer get its power supply via an adapter.
 *
 */

public class Laptop
{
    public static void main(String[] args) {
//	   PowerSupply supply = new WallSocket();
	   PowerSupply supply = new PowerAdapter();
	   int power = supply.getPower();
	   System.out.println("The power supply for the laptop is " + power + "V.");
    }
    
}
