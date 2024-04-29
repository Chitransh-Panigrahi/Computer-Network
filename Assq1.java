import java.util.*;
import java.io.*;
public class Assq1 {
	public static void main(String[] args )throws Exception
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\chitr\\OneDrive\\Desktop\\CN LAB 2\\HELLO WELCOME TO ITER.txt");
		int data;
		while((data=fis.read())!=-1) {
			System.out.println("data : "+data+" "+(char)data);
		}
		fis.close();
	}
}
