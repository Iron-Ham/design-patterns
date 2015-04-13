package observer;

/**
 * Event handler
 * 
 * A customer "observes" the publisher for an event 
 * to occur. It handles the event ( a new issue of
 * the magazine has been published) by the update()
 * method that displays a message about what to do
 * with the new issue (randomly).
 */

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Customer implements Observer {
	String name;
	public Customer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	@Override
	public void update(Observable obsv, Object obj) {
		if (obj instanceof Magazine) {
			Magazine mgz = (Magazine) obj;
			Random rdm = new Random();
			String whatToDo;
			int n = rdm.nextInt(6);
			switch (n) {
				case 0 : whatToDo = "donate to library"; break;
				case 1 : whatToDo = "put on shelf"; break;
				case 2 : whatToDo = "give to a friend"; break;
				case 3 : whatToDo = "put at bedside"; break;
				default: whatToDo = "read"; break;
			}
			System.out.printf("%-5s: Received \"%s\", %s\n", name, mgz, whatToDo);
		}
	}

}
