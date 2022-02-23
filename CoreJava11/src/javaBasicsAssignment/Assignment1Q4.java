package javaBasicsAssignment;
import java.util.Scanner;

public class Assignment1Q4 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the the marks of the First subject ");
		int f=input.nextInt();

		System.out.println("Enter the the marks of the First subject ");
		int s=input.nextInt();
	
		System.out.println("Enter the the marks of the First subject ");
		int t=input.nextInt();

		if(f>60 && s>60 && t>60) {
			System.out.println("passed");
		}
		if(f+s>60||s+t>60||t+f>60) {
			System.out.println("promoted");
		}
		else if(f>60||s>60||t>60) {
			System.out.println("failed");
		}
		else if(f+s+t<60) {
			System.out.println("failed");
		}
			
		
		
	}

}


