
package javaBasicsAssignment;
import java.util.Scanner;

public class Assignment1Q5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the amount of CTC");
		int ctc = input.nextInt();
		if(ctc<=180000) {
			System.out.println("NIL");
		}
		else if(ctc>=181001 && ctc<=300000) {
			System.out.println("10%");
		}
		else if(ctc>=300001 && ctc<=500000) {
			System.out.println("20%");
		}
		else if(ctc>=500001 && ctc<=1000000) {
			System.out.println("30%");
		}		
	}

}
