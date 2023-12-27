package tJava;

public class StaticUsageClass1 {
	
	static int age = 35;     // when a variable is declared as static it will be used as common across the classes which can be modified anywhere of the program and called without the object creation 
	
	public static void Staticmethod()   // When a method is declared as static this method can be called across the classes without creating the object
	{
		System.out.println("First Method");
	}
	
	
}
