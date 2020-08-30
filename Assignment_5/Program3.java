/*
3. Write a program which accept two numbers and check whether numbers are equal or not.  
 
	Input : 10 10    
	Output : Equal    
	Input : 10 12    
	Output : Not Equal   
	Input : 10 -10    
	Output : Not Equal 
*/


import java.lang.*;
import java.util.*;

class Program3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int no1= sc.nextInt();
		int no2= sc.nextInt();

		if(no1 == no2)
		{
			System.out.println("Numbers are equal");
		}
		else
		{
			System.out.println("Numbers are not equal");
		}
	}
}
