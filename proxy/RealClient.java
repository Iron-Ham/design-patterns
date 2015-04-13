package proxy;

/**
 * The real client has a private account number
 * and a method to access the account number.
 *
 */

public class RealClient implements Client {
	
	private String accountNo = "04985HK-93";
	
	public String getAccountNo () {
		return accountNo;
	}

}
