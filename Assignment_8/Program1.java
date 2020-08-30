/*
1. Write a program which accept number from user and if number is less than 50 then print small , if it is greater 
than 50 and less than 100 then print medium, if it is greater than 100 then print large. 

	Input  : 75  
	Output : Medium 
*/

import java.lang.*;
import java.util.*;

class Program1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		int no = sc.nextInt();

		if(no < 50)
		{
			System.out.println("Small");	
		}
		else if(no > 50 && no <100)
		{
			System.out.println("Medium");
		}
		else
		{
			System.out.println("Large");
		}
	}
}




