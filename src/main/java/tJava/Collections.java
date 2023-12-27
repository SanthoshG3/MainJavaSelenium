package tJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;




public class Collections {

	public static void main(String[] args) {
		
		//array
		
		int[] arr= new int[5]; // its length is fixed and data type is also fixed
		
		// array list
		ArrayList<Integer> arrint = new ArrayList<Integer>(); // we can add as many as data we want as length is not fixed
		   arrint.add(123);                                    // Duplicate values are allowed
			arrint.add(321);												// can pass the object of a class
		
		ArrayList arrint1 = new ArrayList(); // we can add any type of data type we need we need
		
		arrint1.add(1);
		arrint1.add("Hellow");
		arrint1.add(2, 2.01);
		
	 	arrint1.remove(2);
		
		arrint1.addAll(arrint);
		
		System.out.println(arrint1);
		
		System.out.println(arrint1.get(0));
		
		arrint1.set(0, "Updated");
		System.out.println(arrint1);
		
		
		for(int i : arrint)
		{
			System.out.println(i);
		}
		
		
		Iterator<Integer> it = arrint1.iterator();   // Using Iterator
		
		System.out.println(it.next());
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		// Linked List
		
		LinkedList<String> link = new LinkedList<String>();
		
		link.add("First");
		link.add("Second");
		link.remove(1);
		
		System.out.println("Linked"+link);
		link.set(0, "Hi");
		
		
		//Queue        - First come first out
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println("Queue"+q);
		
		q.remove();                       // will remove first element
		
		System.out.println("Queue"+q);
		
		
		System.out.println(q.peek());     // will give first value
		
		// Priority queue
		PriorityQueue<Integer> qu = new PriorityQueue<Integer>();
		qu.add(4);
		qu.add(3);
		qu.add(2);
		qu.add(1);
		
		System.out.println("PriorityQueue"+qu);    // will sort and add the numbers
		
		qu.remove();                       // will delete first number
		
		System.out.println("PriorityQueue"+qu);
		
		
		System.out.println(q.peek());
		
	//Hashset
	 
	Set<String> set1 = new HashSet<String>();   // it will not store duplicate elements
	set1.add("qwe");
	set1.add("sandy");							// hash set arrangements are random ,so elements are stored in random areas
	set1.add("San");
	set1.add("sandy");
	set1.add("Dupli");
	
	System.out.println("Set"+ set1);
	
	ArrayList<String> list3 = new ArrayList<String>(set1);  // convert set into list
	list3.get(0);
	
	LinkedHashSet<String> set2 = new LinkedHashSet<String>();
	set2.add("qwe");
	set2.add("sandy");							// Linked Hash set will store in ordered way
	set2.add("San");
	set2.add("sandy");
	set2.add("Dupli");
	
	System.out.println("Set2"+ set2);
}
}