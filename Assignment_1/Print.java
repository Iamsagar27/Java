import java.lang.*;
import java.util.Scanner;

class Print
{
	public static void main(String[] args) 
	{
		int i = 0 , cnt = 0;

		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		cnt = sc.nextInt();

		for(i=1 ; i<=cnt ; i++)
		{
			System.out.print("*\t");
		}
	}
}