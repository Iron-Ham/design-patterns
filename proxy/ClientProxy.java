package proxy;

/**
 * A proxy for Client. It adds a layer (asking for
 * password) before the method of the real client
 * can be called.
 */

import java.util.Scanner;

public class ClientProxy implements Client {
	private String password;
	private RealClient client;
	
	public ClientProxy(String pwd) {
		password = pwd;
		client = new RealClient();
	}
	
	public String getAccountNo() {
		System.out.print("Enter password: ");
		Scanner scan = new Scanner(System.in);
		String pwd = scan.nextLine();
		if (pwd.equals(password))
			return client.getAccountNo();
		else
			return null;
	}

}
