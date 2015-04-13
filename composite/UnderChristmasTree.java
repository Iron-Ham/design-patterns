package composite;

/**
 * An application using composite pattern.
 * 
 */
 
public class UnderChristmasTree
{
   public static void main(String[] args) {
     Toy toy1 = new Toy("Smart Car Robotics");
     Toy toy2 = new Toy("Qwirkle Board Game");
     Clothing cloth1 = new Clothing("Ralph Lauren");
     Clothing cloth2 = new Clothing("Adriano and Goldsign");
           
     GiftBox box1 = new GiftBox();
     GiftBox box2 = new GiftBox();
     GiftBox box = new GiftBox();
     
     box1.add(toy1);
     box1.add(toy2);
     box1.add(cloth1);
     
     box2.add(toy1);
     box2.add(cloth1);
     box2.add(cloth2);
     
     box.add(box1);
     box.add(box2);
     box.display();
   }
}
