package javaBasicsAssignment;

public class Assignment1Q2 {
	public static void main(String[] args) {
		int check, rem, sum=0,number ;
		
		for( number=100; number<1000; ++number) {
			check=number;
			
			 while(check != 0) {
		         rem = check % 10;
		         sum = sum + (rem * rem * rem);
		         check = check / 10;
		      }
			 if(sum==number)
			         System.out.println(number);
		sum=0;	 		
		}
	}

}