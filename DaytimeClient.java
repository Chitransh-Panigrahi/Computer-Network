import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DaytimeClient {
    public static void main(String[] args) {
        String serverAddress = "time.nist.gov"; // You can use another Daytime server if desired
        int serverPort = 13; // Daytime Protocol uses port 13

        try {
            // Connect to the Daytime server
            Socket socket = new Socket(serverAddress, serverPort);

            // Create a BufferedReader to read the response from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Read and print the server's response
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println("Server Response: " + response);
            }

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
