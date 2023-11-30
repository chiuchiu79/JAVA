package tw.brad.tutor;

import java.net.InetAddress;
import java.net.Socket;

public class Brad56 {

	public static void main(String[] args) {
		try {
			Socket client = new Socket(InetAddress.getByName("10.0.104.130"), 9999);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
