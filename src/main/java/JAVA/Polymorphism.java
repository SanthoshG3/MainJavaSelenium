package JAVA;

public class Polymorphism {

	public static void main(String[] args) {
		  dog1 Sounds = new dog1();
		 System.out.print( Sounds.localbreed());    // Has many shapes like having the same method name in different classes and itetrate using same object
		  
		  Sounds = new Cat1();
		  System.out.println("\n"+ Sounds.localbreed());
	}
	
}
class dog1{
	String Sound = "Bark";
	
	public String localbreed()
	{
		String bread = "Local";
		return Sound+bread;
		
	}
	public String highclassbreed()
	{
		String bread ="Soft";
		return Sound+bread;
	}
}
	
class Cat1 extends dog1{
	String Sound = "Meaoww";
	
	public String localbreed()
	{
		String bread = "Local";
		return Sound+bread;
	}
	public String highClassbreed()
	{
		String bread = "Soft";
		return bread+Sound;
	}
}
	


