import java.lang.*;

class Base
{
	public int i = 11 ;
	public int j = 21 ;

	public Base ()					// Constructor
	{
		System.out.println("Inside Base Constructor");
	}

	public void fun()
	{
		System.out.println("Inside Base fun");
	}
}

class Derived extends Base
{
	public int x = 10;

	public Derived()
	{
		System.out.println("Inside Derived Constructor");	
	}

	public void fun()
	{
		System.out.println("Inside Derived fun");
		super.fun();
		System.out.println("Value of Base i :" +super.i);
		System.out.println("Value of Derived x :" +this.x);
	}
	public void gun()
	{
		System.out.println("Inside gun");
	}
}

class Inheritance
{
	public static void main(java.lang.String args[])
	{
		Base bobj = new Base();
		Derived dobj = new Derived();

		bobj.fun();
		dobj.fun();

		Base ref = new Derived();			//Upcasting
		ref.fun();							//Derived fun
	}
}

















