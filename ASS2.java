
	import java.util.*;
	import java.io.*;
	public class ASS2 {

		public static void main(String[] args) throws Exception{
	        	FileOutputStream fout=new FileOutputStream("C:\\\\Users\\\\chitr\\\\OneDrive\\\\Desktop\\\\CN LAB 2\\\\text.txt");
	        	String s = "Welcome to CN Lab";
	        	byte b[]= s.getBytes();
	        	fout.write(b);
	        	fout.close();
	        	System.out.println("Success...");     
		}

	}
