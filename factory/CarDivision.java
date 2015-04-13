package factory;

/**
 * A car division is an implementation of auto maker.
 *
 */

public class CarDivision implements AutoMaker {

   Automobile car;
   
   public CarDivision() {
      car = new Car();
   }
   
   public Automobile makeAutomobile() {
      return car;
   }
}