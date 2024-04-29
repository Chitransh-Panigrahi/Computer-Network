import java.net.*;
public class DetermineIP_Website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		InetAddress address = InetAddress.getByName("www.google.com");
		
		System.out.println(address);
		}catch(UnknownHostException ex) {
			System.out.println("Could not find www.google.com");
		}
		}
	}


