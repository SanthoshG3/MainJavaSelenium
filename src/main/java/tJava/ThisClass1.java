package tJava;

public class ThisClass1 {

	int age;
	String Gender ;
	
	public void thismethod(int age, String Gender)
	{
	//	age = age;     // when this method was called age will retun 0 as both the age refers to same
	//	Gender = Gender;
		
		this.age = age;   // this. will specify the first age with local Variable and 2nd age with calling method variable
		this.Gender= Gender;
	}
}
