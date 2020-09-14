/*
2. Accept amount in US dollar and return its corresponding value in Indian currency. Consider 1$ as 70 rupees.  

Input :  10 		Output :  700 
Input :  3 			Output :  210  
Input :  1200 		Output :  84000 
*/

import java.lang.*;
import java.util.*;

class Program2
{
	public static void main(String[] args) 
	{
		int iConvet = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the money in US dollar :\t");
		int iNo = sc.nextInt();

		iConvet = iNo * 70 ;
		
		System.out.println("The money in Indian Rupees :" + iConvet);

	}
}

