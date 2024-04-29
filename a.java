
import java.io.*; 
import java.net.*; 
public class a {
		public static void main(String args[]) throws Exception 
		{  
			URL url = new URL("https://www.soa.ac.in/iter"); 
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream())); 
			BufferedWriter writer = new BufferedWriter(new FileWriter("Download.html")); 
			String line; 
			while ((line = reader.readLine()) != null) { 
				writer.write(line); 
			} 
			reader.close(); 
			writer.close(); 
			System.out.println("Successfully Downloaded.");
		} 
} 