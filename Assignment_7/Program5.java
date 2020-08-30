/*
5.Write a program which accept number from user and return difference between summation of even digits and summation 
of odd digits. 
Input :  2395  Output :  -15 (2 - 17) 
Input :  1018 Output :  6 (8 - 2) 
Input :  8440 Output :  16  (16 - 0) 
Input :  5733 Output :  -18 (0 - 18)
*/

import java.lang.*;
import java.util.*;

class Program5
{
	public static void main(String args[])
	{
		int digit = 0,even= 0 ,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number  :");
		int no = sc.nextInt();
		
		while(no != 0)
		{ 
			digit = no % 10;
			if((digit % 2) == 0)
			{
				even = even + digit;				
			}
			else
			{
				odd = odd + digit;
			}
			no /=10;
		}
		System.out.print("Difference betn Summation of even and odd : " + (even - odd));
	}
}














