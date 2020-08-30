/*
1.Write a program which accept number from user and display its digits in reverse order. 
Input :  2395  Output :  5   9   3   2 
Input :  1018 Output :  8   1   0   1 
Input :  -1018 Output :  8   1   0   1 
Input :  9000 Output :  0   0   0   9 
*/

import java.lang.*;
import java.util.*;

class Program1
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
			rev = (rev * 10) + digit;
			no =no / 10;
		}
		System.out.print(rev);
	}
}