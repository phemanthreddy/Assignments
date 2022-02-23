package javaBasicsAssignment;
	import java.util.Scanner;
	public class Assignment1Q6 {
		public static void main(String[] args) {
			
			String userid="hemanth";
			String password= "phreddy";
			Scanner input=new Scanner(System.in);
			int x=0;
			for (int i = 1; i <= 3; i++) {
				System.out.println("Enter UserID");
				String id = input.next();
				System.out.println("Enter Password");
				String pass = input.next();
				
				if ((id.equals(userid)) && (pass.equals(password))) {
					System.out.println("Welcome" );
					break;
				}	x++;
}
	if (x == 3){
	    System.out.println("Contact Admin");
			}
		}

	}