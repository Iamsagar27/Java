import java.lang.*;
import java.util.Scanner;

class Program4
{
	public static void main(String[] args) 
	{
		int first = 0 , second = 0 , i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Number");
		first = sc.nextInt();
		System.out.println("Enter second Number");
		second = sc.nextInt();

		if(second < 0)
		{
			second = -second;
		}
		for( i = 1 ; i <=second ; i++)
		{
			System.out.print(first+"\t");	
		}

	}
}