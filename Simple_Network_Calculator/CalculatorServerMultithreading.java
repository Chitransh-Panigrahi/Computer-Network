package Simple_Network_Calculator;

import java.io.*;
import java.net.*;
import java.util.Arrays;

public class CalculatorServerMultithreading {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected.");

                ClientHandler clientHandler = new ClientHandler(socket);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private record ClientHandler(Socket socket) implements Runnable {

        @Override
            public void run() {
                try {
                    BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                    String inputLine;
                    while ((inputLine = input.readLine()) != null) {
                        double result = evaluateExpression(inputLine);
                        output.println(result);
                    }

                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            private double evaluateExpression(String expression) {
                // Implement your scientific calculator logic here to evaluate the expression
                // For simplicity, this example uses basic arithmetic
                try {
                    String[] parts = expression.split(" ");
                    String operator;
                    double num = 0, num1 = 0, num2 = 0;


                    if(Arrays.asList(parts).contains("sin") ||
                            Arrays.asList(parts).contains("cos") ||
                            Arrays.asList(parts).contains("tan") ||
                            Arrays.asList(parts).contains("log")){
                        num = Double.parseDouble(parts[1]);
                        operator = parts[0];
                    } else if (Arrays.asList(parts).contains("!")) {
                        operator = parts[0];
                        num = Double.parseDouble(parts[1]);
                    } else {
                        num1 = Double.parseDouble(parts[0]);
                        num2 = Double.parseDouble(parts[2]);
                        operator = parts[1];
                    }
                    switch (operator) {
                        case "+":
                            return num1 + num2;
                        case "-":
                            return num1 - num2;
                        case "*":
                            return num1 * num2;
                        case "/":
                            if (num2 != 0) {
                                return num1 / num2;
                            } else {
                                return Double.NaN; // Indicate division by zero
                            }
                        case "!":
                            return factorial(num);
                        case "^":
                            return Math.pow(num1, num2);
                        case "sin":
                            return Math.sin(Math.toRadians(num));
                        case "cos":
                            return Math.cos(Math.toRadians(num));
                        case "tan":
                            return Math.tan(Math.toRadians(num));
                        case "log":
                            return Math.tan(num);
                        default:
                            return Double.NaN; // Indicate invalid operation
                    }
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    return Double.NaN; // Indicate invalid input
                }
            }
        }
        public static double factorial(double num){
            double result = 1;
            for (double i = 2; i <= num; i++) {
                result *= i;
            }

            return result;
        }
}
