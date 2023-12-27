package tJava;

public class ExceptionHandlingClass1 {
	
	public static void main(String[] args) {
		int a =0;
		int b =5;
		
		try {
			int c =b/a;  
		}
		catch(ArithmeticException E)  // As the  try has Arithmetic exception this will execute
		{
			System.out.println("A is 0");
		}
		catch(Exception A)      // can use multiple exception at least it should have one catch for try  
		{
			
		}
		finally             // This will execute even if there is exception or no exception
		{
			System.out.println("Finally Block");
		}
		System.out.println("Last Line of code");
		
		
		
	}
	
	public static void throwmethod(int age) throws IllegalAccessException
	{
		
		if(age<18 && age >16)
		{
			throw new ArithmeticException("Age less than 18");       // throw keyword is used to throw the exception manually and handled in another class2
		}
		else
		{
			throw new IllegalAccessException("Illegal Age");
		}
		
		
		
		
	}

}
