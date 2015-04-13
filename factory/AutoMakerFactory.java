package factory;

/**
 * This class shows the factory design pattern
 * by providing a getInstance() method to return
 * an automobile maker.
 */
 
public class AutoMakerFactory {

   public static AutoMaker getInstance(String kind) {
      if (kind.equals("car"))
          return new CarDivision();
      else if (kind.equals("truck"))
          return new TruckDivision();
      else
          return null;
   }
}