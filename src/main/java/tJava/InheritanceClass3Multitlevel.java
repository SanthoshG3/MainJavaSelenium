package tJava;

public class InheritanceClass3Multitlevel extends InheritanceClass2CatWithPolymorphismMethods // this inherits the child class of the Animal ,for this class InheritanceClass2CatWithPolymorphismMethods is a parent class 
{
	
String sound = "Bark";
	
	public void dogsound()
	{
		System.out.println(sound);
	}
	
	public void dogheight()
	{
		System.out.println("Taller Than Cat");
	}
	
	/*public void avglegs()  
	{
		
		System.out.println("4 Legs from Multilevel class3S");
	} */	 public void Multilevel()
	 {
		 System.out.println("Multilevel class i.e child");
	 }

}


// InheritanceClass1Animals - Grandparent
// InheritanceClass2CatWithPolymorphismMethods - Parent
// InheritanceClass3Multitlevel - Child
