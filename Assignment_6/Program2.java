/*
2.Write a program which accept number from user and check whether it contains 0 in it or not. 
Input :  2395  Output :  There is no Zero 
Input :  1018 Output :  It Contains Zero 
Input :  9000 Output :  It Contains Zero 
Input :  10687 Output :  It Contains Zero 
*/

import java.lang.*;
import java.util.*;

class Program2
{
	public static void main(String args[])
	{
		int digit = 0,rev = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :\t");
		int no = sc.nextInt();

		if(no < 0)
		{
			no = -no;
		}

		while(no != 0)
		{
			digit = no % 10;
			if(digit == 0)
			{
				break;
			}
			no = no /10;
		}

		if(digit == 0)
		{
			System.out.print("it contain zero");
		}
		else
		{
			System.out.print("it does not contain zero");
		}
	}
}