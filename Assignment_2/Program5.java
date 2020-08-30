import java.lang.*;
import java.util.Scanner;

class Program5
{
	public static void main(String[] args) 
	{
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		i = sc.nextInt();

		if((i % 2) == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}