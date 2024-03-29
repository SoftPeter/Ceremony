package C16_Networking;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class UdpClient {
	public void start() throws IOException, UnknownHostException{
		DatagramSocket dtsocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		
		byte[] msg = new byte[100];
		
		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		dtsocket.send(outPacket);
		dtsocket.receive(inPacket);
		
		System.out.println("current server time : " + new String(inPacket.getData()));
		
		dtsocket.close();
	}
	public static void main(String[] args) {
		try {
			new UdpClient().start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}