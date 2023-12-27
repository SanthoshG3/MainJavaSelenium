package tJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputFromExternalFile {

	public static void main(String[] args) throws IOException {
		filewrite();
		fileread();
		
		
	}
	
	public static void filewrite() throws IOException
	{
		File file = new File("C:\\Users\\santhog\\eclipse-workspace\\SeleNew\\src\\samplesourcefile\\examp.txt");
		FileWriter obj2 = new FileWriter(file);
		
	    obj2.write("the value is writed");		
	    obj2.close();
	}
	
	public static void fileread() throws FileNotFoundException
	{
		File file1 = new File("C:\\Users\\santhog\\eclipse-workspace\\SeleNew\\src\\samplesourcefile\\examp.txt");
		System.out.println(file1.canRead());
		
		Scanner obj = new Scanner(file1);
		
		while(obj.hasNextLine())
		{ 
			System.out.println(obj.nextLine());
		}
	}
	 
	

}