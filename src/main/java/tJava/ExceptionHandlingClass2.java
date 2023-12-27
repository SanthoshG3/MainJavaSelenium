package tJava;

public class ExceptionHandlingClass2 {

	public static void main(String[] args)  {
		ExceptionHandlingClassUserDefinedException obj = new ExceptionHandlingClassUserDefinedException("UserDefined");
		try
		{
			ExceptionHandlingClass1.throwmethod(15);
			obj.getMessage();
			
		}
		catch(ArithmeticException E)
		{
			System.out.println(E.getMessage());
		}
		catch(IllegalAccessException I)
		{
			System.out.println(I.getMessage());
		}
	}

}
