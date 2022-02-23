package javaBasicsAssignment;
import java.util.*;
public class Assignment1Q8 {


	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int a[]=new int [10];
System.out.println("Enter array elements");
for(int i=0;i<10;i++)
{
	a[i]=s.nextInt();
}
for(int j=0;j<10;j++)
{
	for(int k=j+1;k<5;k++)
	{
		if(a[j]>a[k])
		{int temp=a[j];
			a[j]=a[k];
			a[k]=temp;
		}
	}
	
}
for( int i=0;i<10;i++)
{
	System.out.print(a[i]+" ");
}
	}

}