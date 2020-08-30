/*
4.Write a program which accept number from user and return multiplication of all digits. 
Input :  2395  Output :  270 
Input :  1018 Output :  8 
Input :  9440 Output :  144 
Input :  922432 Output :  864
*/

import java.lang.*;
import java.util.*;

class Program4
{
	public static void main(String args[])
	{
		int digit = 0,cnt = 0,mult = 1;
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
				digit = 1;
			}
			mult = mult * digit;
			no = no /10;
		}
	
		System.out.print(mult);	
	}
}






