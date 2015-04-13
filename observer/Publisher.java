package observer;

/**
 * Event source.
 * 
 * The publisher is "observable" where event occurs.
 * An event is "a new issue is published."
 */


import java.util.Observable;

public class Publisher extends Observable {
	
	String name;
	
	public Publisher(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void subscribe(Customer c) {
		addObserver(c);
	}
	
	public void publish() {
		Magazine mgz = new Magazine("New York Time", 2014, 0);
		for (int month = 1; month <= 12; month++) {
			mgz.setIssue(month);
			setChanged();
			notifyObservers(mgz);
			System.out.println();
		}
	}
}
