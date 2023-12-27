package tJava;

public class InterfactClass2 implements InterfaceClass1  // interface class should be extend with implements keyword
{														// all abstract methods in Interface class should be implemented in the sub class 
	
	public void first()
	{
		System.out.println("First");
	}

	public void second() {
		
		System.out.println("Second");
	}

	public void third() {
		System.out.println("Third");
		
	}
	
	public static void main(String[] args)
	{
		InterfactClass2 obj = new InterfactClass2();
		obj.first();
	}

	

}
