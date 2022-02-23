package StringAssignment;

public class StringBuiderClass {
public static void main(String[] args) {
	
	StringBuilder sb= new StringBuilder("String Buffer");
	sb.append(" is a peer class of String");
	sb.append(" that provides much of");
	sb.append(" the functioinality of strings");
	
	System.out.println(sb);

	StringBuilder str= new StringBuilder("It is used to at the specified index position");

	str.insert(13, " Insert Text");
	System.out.println("After Insertion = "+str.toString());
	
	StringBuilder str1= new StringBuilder("This method returns the reversed object on which it was called");
	str1.reverse();
	System.out.println(str1.toString());

	
}
}