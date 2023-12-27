package tJava;

public class ConstructorClass2 {

	public static void main(String[] args) {
//		ConstructorClass1 obj = new ConstructorClass1(); - default constructor calling
	//	System.out.println(obj.RollNo);  //Accessing the default values from constructor method else value will be 0
//	System.out.println(obj.Name);	//Accessing the default values from constructor method else value will be null
		
		
		ConstructorClass1 obj2 = new ConstructorClass1(31,"Name");  // this is calling the parameterized constructor, it will be called  by default as we create the object
		obj2.display();
		System.out.println(obj2.RollNo);
		System.out.println(obj2.Name);

	}
	
	
	

}
