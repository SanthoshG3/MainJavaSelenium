package tJava;

public class InheritanceClass1Animals {
	
	int Legs;
	boolean eat = true;
	
	public boolean eat()
	{
		return true ;
	}
	
	public boolean walk()
	{
		return true;
	}
	
	public boolean sing()
	{
		return false;
	}
	public void avglegs()  // Method for Method Over riding , writing same methods on parent and child class
	{
		
		System.out.println("3 Legs from parent");
	}

}
