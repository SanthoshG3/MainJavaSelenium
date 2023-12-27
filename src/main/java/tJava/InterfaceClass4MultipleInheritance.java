package tJava;

public class InterfaceClass4MultipleInheritance implements InterfaceClass1,InterfaceClass3  // Multiple inheritance is achieved through the interface as there is no confusion in implementing the method from both the parents because those methods have no body   
{

	

	public void fourth() {
		// TODO Auto-generated method stub
		
	}

	public void first() {
		System.out.println("first");
		
	}

	public void second() {
		// TODO Auto-generated method stub
		
	}

	public void third() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
	
		InterfaceClass4MultipleInheritance obj2 = new InterfaceClass4MultipleInheritance();
		obj2.first();
	}


}
