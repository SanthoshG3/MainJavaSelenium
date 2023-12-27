package tJava;

public class FinalSuperThisClass2 extends FinalSuperThis{

	
// final	
//	public void changemethod()       unable to re write the changemethod as this method was declared as final in FinalSuperThis class
	{
		
	}
// super	
	public void display()           // overriding the display method from the base class , as it has the same method name
	{
		System.out.println("class2");
		 super.display();          // This will call the display class from the parent not child as we called as super
	}
	
	public static void main(String[] args) {
		FinalSuperThisClass2  class2 = new FinalSuperThisClass2();
	 
		class2.display();
	
	}

}
