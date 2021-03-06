/*
2.Write a program which accept number from user and return the count of odd digits. 
Input :  2395  Output :  3 
Input :  1018 Output :  2 
Input :  -1018 Output :  2 
Input :  8462 Output :  0 
*/


import java.lang.*;
import java.util.*;

class Program2
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
			if((digit % 2 ) != 0)
			{
				cnt++;
			}
			no = no /10;
		}
	
		System.out.print(cnt);	
	}
}