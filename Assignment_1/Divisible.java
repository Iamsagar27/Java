import java.lang.*;
import java.util.Scanner;

class Divisible
{
	public static void main(String[] args) 
	{
		int i = 0;

		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();

		if((i % 5) == 0 )
		{
			System.out.println("Divisible");
		}	
		else
		{
			System.out.println("Not Divisible");
		}
	}
}