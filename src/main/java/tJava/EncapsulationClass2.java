package tJava;

public class EncapsulationClass2 {

	public static void main(String[] args) {
		EncapsulationClass1 obj = new EncapsulationClass1();
		
//		obj.password = "jsf";  we can't set value to private variable
		
		String pass = obj.getPassword();   // this will get the private variable from the owner class as the variable is called my the method of its own class
		System.out.println(pass);
		
		
		obj.setPassword("NewPass", "OldPass"); // we can able to set the value to the private variable by sending the values to the owner class
		obj.display();
		
		
		//Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
		//It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
		//Encapsulation provides ultimate control over the data members and data methods inside the class.
		//Data hiding is a procedure done to avoid access to the data members and data methods and their logical implementation. Data hiding can be done by using the access specifiers. We have four access specifiers

	}

}
