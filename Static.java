import java.lang.*;

class Demo
{
	public int i;						//instance variablle				
	public static int j;				//class variable

	static
	{
		System.out.println("Inside first static");
	}

	static
	{
		System.out.println("Inside second static");
	}

	public Demo()
	{
		System.out.println("Inside constructor");
		i=11;
		//j=10;      //Avoid
	}

	public void fun()
	{
		System.out.println("Inside fun");
	}

	public static void gun()
	{
		System.out.println("Inside gun");
	}
}

class Static
{
	static 
	{
		System.out.println("Inside static of Demo");
	}

	public static void main(java.lang.String args[])
	{
		Demo.gun();
		System.out.println("Value of j :"+ Demo.j);

		Demo obj = new Demo();
		obj.fun();
		System.out.println("Value of i :"+obj.i);
	}
}
















