package Simple_Network_Calculator;

import java.io.*;
import java.net.*;

public class CalculatorClient3 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String expression = "";
            while (!expression.equals("exit")) {
                System.out.print("Enter expression (e.g., 2 + 3) (enter 'exit' to exit): ");
                expression = userInput.readLine();
                if (expression.equalsIgnoreCase("exit")) {
                    break;
                }
                output.println(expression);
                double result = Double.parseDouble(input.readLine());
                System.out.println("Result: " + result);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
