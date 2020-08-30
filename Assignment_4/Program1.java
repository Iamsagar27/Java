/*
1.Write a program which accept number from user and display its multiplication of factors. 
Input :  12 Output : 144  (1 * 2 * 3 * 4 * 6) 
Input : 13 Output : 1  (1) 
Input :  10   Output : 10  (1 * 2 * 5) 
*/


import java.lang.*;
import java.util.*;

class Program1
{
	public static void main(String args[])
	{
		int i = 0,factor = 1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number  :");
		int no = sc.nextInt();
		
		for(i = 1; i < no ; i++)
		{
			if((no % i) == 0)
			{
				factor = factor * i ;
			}
		}
		System.out.println("multiplication of factor : "  +factor);
	}
}