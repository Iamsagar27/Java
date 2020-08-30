/*
5.Write a program which accept number from user and count frequency of such a digits which are less than 6. 
Input :  2395  Output :  3 
Piyush Khairnar - 7588945488                      आी Technical संार करतो !!!               ©Marvellous Infosystems         Page 4
Marvellous Logic Building Assignment : 6                                                      
Input :  1018 Output :  3 
Input :  9440 Output :  3 
Input :  96672 Output :  1
*/

import java.lang.*;
import java.util.*;

class Program5
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
			if(digit < 6)
			{
				cnt++;
			}
			no = no /10;
		}
	
		System.out.print(cnt);	
	}
}