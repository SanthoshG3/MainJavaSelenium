package tJava;

public class FirstClass
{
	String Name;
	int Rollno ;
	private String priv ;
	                       // protected will give access inside the package not outside
 public void details()
 {
	 System.out.println(Name);
	 System.out.println(Rollno);
	 if (priv!= null)
	 {
		 System.out.println(priv);
	 }
 }
 
 public void setName(String Address , int Age)
 {
	 System.out.println(Address);
	 System.out.println(Age);
 }
 public void setName2(String Address , int Age , String priv2)
 {
	 Name = Address;
	 Rollno = Age;
	 priv = priv2;
	 
 }
 
 private void privatemethod()
 {
	 System.out.println("Private");       // Can be accessed only inside the class , cannot be called outside the class
	 
 }
 
 public String retrunvalue()
 {
	return priv;
	 
 }
	public static void main(String[] args)
	{
		FirstClass obj2 = new FirstClass(); // accessing private inside the class it will work
		obj2.privatemethod();
		
	}
 
}
