package tJava;

import java.util.Scanner;

public class Scannerclass1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int a =obj.nextInt();
		
		System.out.println(a);
		
		float b =obj.nextFloat();
		
		System.out.println(b);
		
		String c = obj.next();  // this will take only first word of a sentence
		
	 System.out.println(c);
		
		System.out.println("Enter string");
		Scanner obj2 = new Scanner(System.in); // don't use the same object for string after object is used for it as it skips, create new object 
		String d = obj2.nextLine();
		
		System.out.println(d);
		
		  char e = obj.next().charAt(0);
		
          System.out.println(e); 
	}

}
