package tJava;

public class ExceptionHandlingClassUserDefinedException extends Exception{

	ExceptionHandlingClassUserDefinedException(String str)
	{
		super(str);
		System.out.println("UserDefined");
	}
	
}
