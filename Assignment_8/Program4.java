/*
4.Write a program which accept number from user and display its table.  
Input :  2 
Piyush Khairnar - 7588945488                      आी Technical संार करतो !!!               ©Marvellous Infosystems         Page 2
Marvellous Logic Building Assignment : 8                                                        
Output :  2 4 6 8 10 12 14 16 18 20 
Input :  5 Output :  5 10 15 20 25 30 35 40 45 50 
Input :  -5 Output :  5 10 15 20 25 30 35 40 45 50 
*/

import java.lang.*;
import java.util.*;

class Program4
{
	public static void main(String[] args) 
	{
		int table = 1,digit = 0,i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int no = sc.nextInt();

		if(no < 0)
		{
			no = -no;
		}

		for(i = 1 ; i <= 10 ; i++)
		{
			table = no * i;
			System.out.print(" "+table);
		}
		
	}
}

