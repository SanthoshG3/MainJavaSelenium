package tJava;

public class ThisClass2 {

	public static void main(String[] args)
	{
		ThisClass1 obj = new ThisClass1();
		
		obj.thismethod(25, "male");
		System.out.println(obj.age);
		System.out.println(obj.Gender);

	}

}
