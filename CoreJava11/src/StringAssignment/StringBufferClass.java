package StringAssignment;

public class StringBufferClass {


	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("My Name");
		sb.append(" is");
		sb.append(" P Hemanth Reddy");
		System.out.println("After Appending = "+sb);
		
		
		StringBuffer str= new StringBuffer("I Am ");
		str.insert(5, "Hemanth");
		System.out.println("After insertion = "+str.toString());
		

		StringBuffer str1= new StringBuffer("Hemanth");
		str1.reverse();
		System.out.println("Hemanth in the reverse order = "+str1.toString());
	}

}