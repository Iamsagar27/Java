/*
2.  Write a program which accept one number from user and check whether that number is greater than 100 or not.   
  
  Input : 101    
  Output : Greater  
  Input : 39    
  Output : Smaller 

*/


import java.lang.*;
import java.util.*;

class Program2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int no= sc.nextInt();

		if( no > 100)
		{
			System.out.println("Number is greater than 100");
		}
		else if(no == 100)
		{
			System.out.println("Number is equal to 100");
		}
		else
		{
			System.out.println("Number is smaller than 100");
		}
	}
}





