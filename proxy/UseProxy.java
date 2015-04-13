package proxy;

/**
 * A proxy (ClientProxy) is used at the front-end
 * to invoke the real client's method.
 *
 */

public class UseProxy {

	public static void main(String[] args) {
		Client client = new ClientProxy("mypswd");
		String accountNo = client.getAccountNo();
		if (accountNo != null)
			System.out.println("Your accountn # is " + accountNo);
		else
			System.out.println("Sorry, access to the account is denied.");
	}
}
