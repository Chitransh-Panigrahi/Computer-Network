import java.io.*;
import java.net.*;
public class b {

	public static void main(String[] args)throws Exception {
		URL www = new URL("http://www.ibiblio.org/");
		URL http = new URL("http://ibiblio.org/");
		if(www.equals(http)) {
			System.out.println(http+" is same as "+www);
		}
		else {
			System.out.println(http+" is not same as "+www);
		}
	}

}