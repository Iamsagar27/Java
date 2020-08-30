/*
5. Write a program which accept total marks & obtained marks from user and calculate percentage.  
 
Input :  1000  745    
Output :  74.5%
*/

import java.lang.*;
import java.util.*;

class Program5
{
	public static void main(String args[])
	{
		float result = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total marks and obtained marks :");
		float tmarks= sc.nextFloat();
		float omarks= sc.nextFloat();

		result = (omarks*100) / tmarks ;
		
		System.out.println(result);
	}
}






