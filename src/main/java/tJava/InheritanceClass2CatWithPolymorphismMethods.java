package tJava;

public class InheritanceClass2CatWithPolymorphismMethods extends InheritanceClass1Animals // this inherits only one base class i.e InheritanceClass1Animals so this is called Single Inheritance

{
	String sound = "meaow";
	
	public void Catsound()
	{
		System.out.println(sound);
	}
	
	public void catheight()
	{
		System.out.println("Shorter than dog");
	}
	
	public void display()												// Polymorphism first method
	{
		System.out.println("Non Parametrized polymorphism display method"); 
	}
	
	public void display(int a)											// This is called method Overloading
	{
		System.out.println("Non Parametrized polymorphism display method"+ a +"with the sended value");// polymorphism second method with same method name as first but with Parameters
	}
	
	public void display(int a , int b)
	{
		System.out.println("Non Parametrized polymorphism display method"+ a +b +"with the sended value");
	}
	
	public void avglegs()  // Method for Method Over riding , writing same methods on parent and child class
	{
		
		System.out.println("4 Legs from Child class2");
	}
}
