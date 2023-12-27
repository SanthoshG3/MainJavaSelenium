package tJava;

abstract class Abstraction {

	//Encapsulation is a fundamental concept in object-oriented programming (OOP) that refers to the bundling of data and methods that operate on that data within a single unit, which is called a class in Java. Encapsulation is a way of hiding the implementation details of a class from outside access and only exposing a public interface that can be used to interact with the class.

	//In Java, encapsulation is achieved by declaring the instance variables of a class as private, which means they can only be accessed within the class. To allow outside access to the instance variables, public methods called getters and setters are defined, which are used to retrieve and modify the values of the instance variables, respectively. By using getters and setters, the class can enforce its own data validation rules and ensure that its internal state remains consistent.

	//This part is already done in constructor program
	
	
	
	//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
	
	
	abstract void abstractmethod();   // Abstract method should not have a body in abstract class in should be defined in subclass
	
	public void sample()
	{
		System.out.println("sample");
	}
	public void sample2()
	{
		System.out.println("sample2");
	}
}
