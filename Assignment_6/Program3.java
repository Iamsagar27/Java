/*
3.Write a program which accept number from user and count frequency of 2 in it. 
Input :  2395  Output :  1 
Input :  1018 Output :  0 
Input :  9000 Output :  0 
Input :  922432 Output :  3
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
			if(digit == 2)
			{
				cnt++;
			}
			no = no /10;
		}
	
		System.out.print(cnt);	
	}
}