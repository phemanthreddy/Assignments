package javaBasicsAssignment;

import java.util.Scanner;
public class Assignment1Q1 {

   public static void main(String args[]) {
      int check, rem, sum = 0;
      System.out.println("Enter the number:");
      Scanner n = new Scanner(System.in);
      int number = n.nextInt();
      check = number;
      while(check != 0) {
         rem = check % 10;
         sum = sum + (rem * rem * rem);
         check = check / 10;
      }
      
      if(sum == number)
         System.out.println("Given number is an armstrong number.");
      else
         System.out.println("Given number is not an armstrong number.");
   }
}
