package StringAssignment;

public class StringClass {



	public static void main(String[]args) {
		String str ="Hello World ";
		System.out.println("Length of the String = " +str.length());
		
		String str1= "Hello ";
		String str2="How are you";
		System.out.println(str1+str2);
		
		String str3=("My Name Is P Hemanth Reddy");
		System.out.println(str3);
		
		System.out.println(str3.toUpperCase());
		
		System.out.println(str3.toLowerCase());
	
		System.out.println(str3.replace('a','$'));
		
		if (str3.contains("Hemanth")) {
			System.out.println("Hemanth is in the string");
		}
		
		System.out.println(str3.equals("My Name Is P Reddy"));
		
		System.out.println(str3.equalsIgnoreCase("My Name Is P Hemanth Reddy"));
		
		
	}
	

}