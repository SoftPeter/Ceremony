package C16_Networking;

import java.util.*;
import java.io.*;
import java.net.*;

public class NetworkEx4 {
	public static void main(String[] args) {
		URL url = null;
		BufferedReader br = null;
		String address = "https://www.naver.com/";
		String line = "";
		
		try {
			url = new URL(address);
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}