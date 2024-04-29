import java.net.*;
public class DetermineIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
		} 
		
		catch (UnknownHostException ex) {
			System.out.println("Could not find this computer's address.");
			}
	}
}


