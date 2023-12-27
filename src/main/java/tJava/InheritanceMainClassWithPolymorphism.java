package tJava;

public class InheritanceMainClassWithPolymorphism {

	public static void main(String[] args) {
		InheritanceClass2CatWithPolymorphismMethods cat = new InheritanceClass2CatWithPolymorphismMethods();   // Even if we create the object for cat we can inherit the methods of animals AS IT EXTENDS THE properties of animal
		
		cat.Catsound();
		
		
		System.out.println(cat.eat());
		System.out.println(cat.sing()); 
		
		System.out.println("Method Overloading");
		cat.display();  // polymorphism    Method Overloading
		
		cat.display(1324);  // polymorphism  it finds according to the arguments this is called Method Overloading
		
		cat.display(1, 2);
		System.out.println("method overriding");
		// below for method overriding
		
		cat.avglegs(); // we have same methods in parent and child class if we inherit it will inherit the child this is called Method overriding
		
		System.out.println("Multilevel Inheritance");
		
		// Below for Multilevel Inheritance
		InheritanceClass3Multitlevel objMultilevel = new InheritanceClass3Multitlevel();
		
		System.out.println(objMultilevel.eat()); // from grand parent
		
		objMultilevel.Catsound();  // from parent
		
		objMultilevel.Multilevel();  // from childs
		
		objMultilevel.avglegs();  // method overriding as both grand parent and parent has same method it will take the parent method [ from low to high ]
		
		
		// below for Hirarchical Inheritance
		
		System.out.println("Hirarchical Inheritance");
		InheritanceClass4Hirarchical objhirar = new InheritanceClass4Hirarchical();
		
		System.out.println(objhirar.eat());  // from parent
		
		objhirar.display(); // from child
		
		InheritanceClass2CatWithPolymorphismMethods objhirar2 = new InheritanceClass2CatWithPolymorphismMethods();
		
		System.out.println(objhirar2.eat());
		
		
		// Hybrid is combination of inheritance 
	}

}
