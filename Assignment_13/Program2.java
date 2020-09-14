/*
2. Accept number from user and display below pattern. 
Input :  5  
Output : 5 # 4 # 3 # 2 # 1 #
*/

import java.lang.*;
import java.util.*;

class Program2
{
	public static void main(String[] args) 
	{
		int i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int iNo = sc.nextInt();


		for(i = iNo ; i>=1 ; i--)	
		{
			System.out.print(i +" # ");
		}
	}
}

