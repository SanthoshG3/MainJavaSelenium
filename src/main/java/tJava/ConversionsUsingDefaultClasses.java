package tJava;

public class ConversionsUsingDefaultClasses {

	public static void main(String[] args) {
	
		String a = Integer.toString(243);
		System.out.println(a.matches("243"));
		
		
		String b = Integer.toBinaryString(15);
		System.out.println(b);
		
		String c = "shandrip";
		
		System.out.print(c.equals("shandrip"));
		
		System.out.print("\n"+c.charAt(1));
		
		char[] d = c.toCharArray();
		
		System.out.println("\n"+d[2]);

	}

}
