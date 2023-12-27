package tJava;

public class SecondClass {

	public static void main(String[] args) {
		FirstClass detail = new FirstClass();
		detail.Rollno=123;
		detail.Name="Shan";
		detail.details();
		
		FirstClass detail2 = new FirstClass();
		detail2.Name="Shan2";
		detail2.Rollno=1234;
		detail2.details();
		
		
		detail.setName("Shan3", 25);
		
		
		detail.setName2("Address", 25 , "Private");     // able to access the private string "priv" because it was accessed by the owner class
		detail.details();
	//	detail.priv = "string"; unable to assign priv because its private in first class
		
	//	detail.privatemethod();   Unable to access private method of other class
		
		String getprivate = detail.retrunvalue();
		System.out.println(getprivate);    // get private value of first class by creating return method in first value
	}

}
