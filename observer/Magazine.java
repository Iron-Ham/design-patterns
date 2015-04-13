package observer;

/**
 * Event object
 * 
 * A new issue of magazine is passed to the update() method
 * in the event handler (observer).
 *
 */


public class Magazine {
	String title;
	int year;
	int issue;
	
	public Magazine(String t, int y, int i) {
		title = t;
		year = y;
		issue = i;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getIssue() {
		return issue;
	}
	
	public void setIssue(int m) {
		issue = m;
	}
	
	public String toString() {
		return String.format("%s,%10s%5d", title, month(issue), year);
	}
	
	private String month(int m) {
		String[] months = {"", "January", "February", "March", "April",
				"May", "June", "July", "August", "September", "October",
				"November", "December"};
		
		return months[m];
	}
}
