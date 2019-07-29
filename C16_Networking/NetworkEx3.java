package C16_Networking;

import java.util.*;
import java.net.*;

public class NetworkEx3 {
	public static void main(String[] args) {
		URL url = null;
		String address = "http://www.codechobo.com/sample/hello.html";
		
		try {
			url = new URL(address);
			URLConnection conn = url.openConnection();
			
			System.out.println("conn.toString() : " + conn);
			System.out.println(conn.getAllowUserInteraction());
			System.out.println(conn.getConnectTimeout());
			//System.out.println(conn.getContent());
			System.out.println(conn.getContentEncoding());
			System.out.println(conn.getContentLength());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}