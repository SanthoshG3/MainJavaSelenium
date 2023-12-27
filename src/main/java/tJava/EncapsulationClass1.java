package tJava;

public class EncapsulationClass1 {
	
	private String password;       // this private string cannot be access with other classes to access this we have below 2 methods
	int Rollno;
	String Name;
	
	public String getPassword()     // this will return the private value when this method is called from other class
	{
		password = "@com";
		return password;
	}
	
	public void setPassword(String Password2 , String name)  // this will set the value for the private variables from the other class
	{
	this.Name = name;
	this.password = Password2;
	}
	
	public void display()
	{
		System.out.println(Name);
		System.out.println(password);
	}

}
