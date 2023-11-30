package tw.brad.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad54 {

	public static void main(String[] args) {
		// IPv4 位址:10.0.104.126；子網路遮罩:255.255.255.0
		String mesg = "石榴姐";
		byte[] data = mesg.getBytes();

		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("10.0.104.130"), 8888);
			socket.send(packet);
			socket.close();
			System.out.println("Send OK!");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
