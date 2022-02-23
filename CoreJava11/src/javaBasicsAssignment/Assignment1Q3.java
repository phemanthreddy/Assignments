package javaBasicsAssignment;
import java.util.Scanner;
import java.lang.Math;

public class Assignment1Q3 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Principal Amount");
		double p = input.nextDouble();
		System.out.println("The entered Amount is = "+p);
		System.out.println("Enter the Annual Intrest rate ");
		double r = input.nextDouble();
		System.out.println("The entered intrest rate is "+r);
		System.out.println("Enter the Term of loan in Years");
		double n = input.nextDouble();
		System.out.println("The entered Term of loan per year is "+n);
		System.out.println("Number of years intrest is applied ");
		double t = input.nextDouble();
		System.out.println("The Number of years the intrest is applied = "+t);
		
		double sum =p*r*n;
		System.out.println("Your Simple Intrest is =" + sum/100 );
	
		double intrest=p*(Math.pow(1+(r/100),t));
		System.out.println("Your compound intrest is ="+intrest);
		
		
		}
		
}