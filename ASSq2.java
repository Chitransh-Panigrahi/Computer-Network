
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ASSq2 {

	public static void main(String[] args) {
		        try (FileInputStream sourceFileInputStream = new FileInputStream("C:\\\\Users\\\\chitr\\\\OneDrive\\\\Desktop\\\\CN LAB 2\\\\HELLO WELCOME TO ITER.txt");
		             FileOutputStream destinationFileOutputStream = new FileOutputStream("C:\\\\Users\\\\chitr\\\\OneDrive\\\\Desktop\\\\CN LAB 2\\\\text.txt")) {

		            byte[] buffer = new byte[1024];
		            int bytesRead;

		            while ((bytesRead = sourceFileInputStream.read(buffer)) != -1) {
		                destinationFileOutputStream.write(buffer, 0, bytesRead);
		            }

		            System.out.println("File copied successfully!");

		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	}

}
