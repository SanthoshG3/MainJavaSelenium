package JAVA;

import java.util.ArrayList;

public class ArraysAndList {

	public static void main(String[] args) {
		String[] color = {"Red","Blue","Yellow","Green"};
		
		for(int i=0;i<color.length;i++)

		{
			System.out.print(color[i]);
		}
		arrayList();
	}
	
	public static void arrayList() {
		ArrayList<String> Name = new ArrayList<String>();
		
		Name.add("San");
		Name.add("Dani");
		Name.add("redi");
		Name.remove(0);
		for (int i = 0; i<Name.size();i++)
		{
			System.out.print(Name.get(i));
		}
	}

}
