package tJava;

public class FinalSuperThis {

	final String Gender = "Male";
	
	int age = 25;    // example for super Keyword 
	
	
	
	
	
	
	public void changeGender()
	{
	//	Gender = "Female";      // this will show error because once the variable is declared with Final we cannot modify 
	}
	
	final void changemethod()       // method is declared as final , refer class2
	{
		System.out.println("changemethod ");  
	}
	
	
	public void display()     // example for super method ,refer class2
	{
		System.out.println("display from parent");
	}
}
