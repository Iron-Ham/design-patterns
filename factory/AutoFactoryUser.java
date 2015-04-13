package factory;

/**
 * This application uses the factory class AutoMakerFactory
 * to create an automobile maker, which makes an automobile.
 */

import java.util.Scanner;

public class AutoFactoryUser
{
    public static void main(String[] args) {
    	
        Scanner s = new Scanner(System.in);
        System.out.print("What type of vehicle do you want (car or truck)? ");
        String autoType = s.nextLine();
        
        AutoMaker maker = AutoMakerFactory.getInstance(autoType);
        Automobile vehicle = maker.makeAutomobile();
        
        vehicle.display();
    }
}