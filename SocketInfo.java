import java.net.InetAddress;
import java.net.Socket;
public class SocketInfo {
 public static void main(String[] args) {
 String host = "www.example.com"; // Replace with the hostname or IP address of the target
 int port = 80; // Replace with the port number of the target service
 try {
 // Create a socket and connect to the target host and port
 Socket socket = new Socket(host, port);
 // Get local socket address information
 InetAddress localAddress = socket.getLocalAddress();
 int localPort = socket.getLocalPort();
 // Get remote socket address information
 InetAddress remoteAddress = socket.getInetAddress();
 int remotePort = socket.getPort();
 // Display socket information
 System.out.println("Local Address: " + localAddress);
 System.out.println("Local Port: " + localPort);
 System.out.println("Remote Address: " + remoteAddress);
 System.out.println("Remote Port: " + remotePort);
 // Close the socket when done
 socket.close();
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
}