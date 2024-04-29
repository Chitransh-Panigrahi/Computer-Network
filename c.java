import java.net.*;
import java.util.Scanner;
import java.io.*;
public class c {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the url : ");
		String url = sc.nextLine();
		URI url1 = new URI(url);
		System.out.println("The protocol is : "+ url1.getScheme());
		System.out.println("The user information  is : "+ url1.getUserInfo());
		String host = url1.getHost();
		if(host!=null) {
			System.out.println("the host name is "+host);
		}
		else {
			System.out.println("the host name is null.");
		}
		System.out.println("The port is "+url1.getPort());
		System.out.println("The path is "+url1.getPath());
		System.out.println("the querry string is "+url1.getQuery());
	}

}