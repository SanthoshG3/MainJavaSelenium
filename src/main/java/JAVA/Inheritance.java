package JAVA;

public class Inheritance {

	public static void main(String[] args) {
		  Cat animal = new Cat();                         // creating object
		System.out.print(animal.localbreed());  
		System.out.print(animal.highclassbreed());
		System.out.print(animal.highClassCat());
		
	}
}
class dog{
	String Sound = "Bark";
	
	public String localbreed ()
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
	
class Cat extends dog{
	String Sound = "Meaoww";
	
	public String localbreedcat()
	{
		String bread = "Local";
		return Sound+bread;
	}
	public String highClassCat()
	{
		String bread = "Soft";
		return bread+Sound;
	}
}
	


