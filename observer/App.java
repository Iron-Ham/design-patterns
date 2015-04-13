package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * A sample program of the observer pattern for
 * a publisher to publish new issues of a magazine.
 * 
 * Create a list of customers and have each of them
 * subscribing to the publisher.
 *
 */

public class App {

	public static void main(String[] args) {
		Publisher pub = new Publisher("International Data Group");
		
		String[] names = {"Joe", "Jane", "Mike", "Amy"};
		List<Customer> customers = new ArrayList<>();
		for (String s : names) 
			customers.add(new Customer(s));
		
		for (Customer c : customers)
			pub.subscribe(c);
		
		pub.publish();
	}
}
