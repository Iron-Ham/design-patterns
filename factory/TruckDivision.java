package factory;

/**
 * A truck division is an implementation of auto maker.
 *
 */

public class TruckDivision implements AutoMaker {

   Automobile truck;
   
   public TruckDivision() {
      truck = new Truck();
   }
   
   public Automobile makeAutomobile() {
      return truck;
   }
}