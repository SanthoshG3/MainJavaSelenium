package JAVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAndThreads {
	public static void main (String[] args)
	{
		List<String> Names = new ArrayList<String>();
		
		Names.add("Apple");
		Names.add("Mango");
		Names.add("Names");
		Names.add("Final");
		
		Iterator<String> it = Names.iterator();
		System.out.print(it.next());
		System.out.print(it.next());
		System.out.print(it.next());
		System.out.print(it.hasNext());
	}
}
