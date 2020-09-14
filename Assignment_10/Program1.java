/*
1.Write a program which accept radius of circle from user and calculate its area. 
Consider value of PI as 3.14. 
(Area = PI * Radius * Radius) 
Input :  5.3  		Output :  88.2026   
Input :  10.4  		Output :  339.6224 
*/

import java.lang.*;
import java.util.*;

class Program1
{
	public static void main(String[] args) 
	{
		double PI = 3.14 , dArea ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :\t");
		double dNo = sc.nextDouble();

		dArea = PI * dNo * dNo;

		System.out.println("Area of circle : "+ dArea);


	}
}




