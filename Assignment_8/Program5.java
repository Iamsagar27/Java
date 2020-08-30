/*
5. Write a program which accept number from user and display its table in reverse order.  
Input :  2 Output :  20 18 16 14 12 10 8 6 4 2 
Input :  5 Output :  50 45 40 35 30 25 20 15 10 5 
Input :  -5 Output :  50 45 40 35 30 25 20 15 10 5 
*/


import java.lang.*;
import java.util.*;

class Program5
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

		for(i = 10 ; i >=1 ; i--)
		{
			table = no * i;
			System.out.print(" "+table);
		}		
	}
}


