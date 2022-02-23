package Generics_Assignment;

public class Assignment5Q4<H, M> {

	private H key;
	private M value;
	public Assignment5Q4(H key, M value) {
		super();
		this.key = key;
		this.value = value;
	}
	public H getKey() {
		return key;
	}
	
	public M getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment5Q4<String, String> p1=new Assignment5Q4<String, String>("1", "one");
System.out.println(p1.getKey()+" "+p1.getValue());

Assignment5Q4<String, java.util.Date> p2=new Assignment5Q4<String, java.util.Date>("2", new java.util.Date());
 System.out.println(p2.getKey()+" "+p2.getValue());
	}

}