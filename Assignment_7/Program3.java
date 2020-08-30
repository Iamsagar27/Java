/*
3.Write a program which accept number from user and return the count of digits in between 3 and 7. 
Input :  2395  Output :  1 
Input :  1018 Output :  0 
Input :  4521 Output :  2 
Input :  9922 Output :  0
*/

import java.lang.*;
import java.util.*;

class Program3
{
	public static void main(String args[])
	{
		int digit = 0,cnt = 0;
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
			if(digit > 3 && digit < 7)
			{
				cnt++;
			}
			no = no /10;
		}
	
		System.out.print(cnt);	
	}
}











