package tJava;

public class StaticUsageClass2 {

	public static void main(String[] args) {
		StaticUsageClass1.Staticmethod();      // staticmethod from the StaticUsage class is called without creating the object		
		StaticUsageClass1.age=30; // Called without creating the object
	}

}
