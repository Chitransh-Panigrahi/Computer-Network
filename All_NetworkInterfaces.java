import java.net.*;
import java.io.*;
import java.util.*;
public class All_NetworkInterfaces {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
		while(interfaces.hasMoreElements()) {
			NetworkInterface ni = interfaces.nextElement();
			System.out.println(ni);
		}
	}

}
