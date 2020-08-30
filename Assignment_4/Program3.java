/*
3.Write a program which accept number from user and display all its non factors. 
Input :  12 Output : 5 7 8 9 10 11 
Input : 13 Output : 2 3 4 5 6 7 8 9 10 11 12  
Input :  10  Output : 3 4 6 7 8 9 
*/

import java.lang.*;
import java.util.*;

class Program3
{
	public static void main(String args[])
	{
		int i = 0,factor = 1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number  :");
		int no = sc.nextInt();
		
		for(i =1; i < no ; i++)
		{
			if((no % i) != 0)
			{
				System.out.print(" " +i);		
			}
		}
	}
}