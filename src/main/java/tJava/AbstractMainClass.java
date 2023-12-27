package tJava;

public class AbstractMainClass {

	public static void main(String[] args) {
		AbstractionSubClass sub = new AbstractionSubClass(); // Here we can create a object of the subclass so that we can inherit and use the methods in Abstraction class and subclass
		
		sub.sample();   
		sub.abstractmethod();

	}
	
// Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
}
