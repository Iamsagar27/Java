/*
1. Accept number from user and display below pattern. 
Input :  5  
Output : A B C D E 
*/

import java.lang.*;
import java.util.*;

class Program1
{
	public static void main(String[] args) 
	{
		int i = 0;
		char ch = '\0';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int iNo = sc.nextInt();


		for(i = 1 ; i<=iNo ; i++)	
		{
			System.out.print(" "+ ('A' -1 +i));
		}
	}
}




