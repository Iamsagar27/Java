/*
4. Write a program which accept three numbers and print its multiplication.  
  Input :  5   4   7    Output :  140  
  Input :  5   0   7    Output :  35  
  Input :  5   0   0    Output :  5  
  Input :  0   0   0    Output :  0
 */

  import java.lang.*;
import java.util.*;

class Program4
{
	public static void main(String args[])
	{
		int mult = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int no1= sc.nextInt();
		int no2= sc.nextInt();
		int no3= sc.nextInt();

		
		if( no1 == 0 )
		{
			no1 = 1;
		}
		if( no2 == 0 )
		{
			no2 = 1;
		}
		if( no3 == 0 )
		{
			no3 = 1;
		}
		

		mult = no1 * no2 * no3 ;

		System.out.println(mult);
	}
}





