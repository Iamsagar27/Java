/*
3.Write a program to find factorial of given number.  
Input :  5  Output :  120   (5 * 4 * 3 * 2 * 1) 
Input :  -5  Output :  120   (5 * 4 * 3 * 2 * 1) 
Input :  4  Output :  24   (4 * 3 * 2 * 1) 
*/

import java.lang.*;
import java.util.*;

class Program3
{
	public static void main(String[] args) 
	{
		int factorial = 1,digit = 0,i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int no = sc.nextInt();

		if(no < 0)
		{
			no = -no;
		}

		for(i = 1 ; i <= no ; i++)
		{
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}