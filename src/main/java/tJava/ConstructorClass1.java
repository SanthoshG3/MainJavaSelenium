package tJava;

public class ConstructorClass1 {

	int RollNo;
	String Name;
	
/*	ConstructorClass1()       // Constructor method which has the same name as the class name used to assign the default values, when the values are called if the variable has none it will look for the default constructor
	{
		System.out.println("Accessing Default Constructor"); // This method is called Default constructor
		RollNo = 1;
	//	Name= "New";         //  Constructor can be a parameterized i.e by passing values where we execute 
	}
	
	*/
	
	ConstructorClass1(int rolno , String Names)  // This is Called parameterized Constructor
	{
		RollNo = rolno;							// We can assign the values while creating the object , by default constructors will be called while creating the object
		Name = Names;							// See the constructorclass2  
	}
	
	public void display()
	{
		System.out.println(RollNo);
		System.out.println(Name);
	}
	
	
}
