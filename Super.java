import java.lang.*;

class Base
{
	public int i = 10;

	public Base(int x)
	{
		System.out.println("Inside Base parameterised");
	}
	public void fun()
	{
		System.out.println("Inside Basee fun");
		System.out.println(this.i);
	}
}

class Derived extends Base
{
	public int x = 21;

	public Derived()
	{
		super(10);
		System.out.println("Inside Derived Constructor");
	}

	public void gun()
	{
		System.out.println(super.i);
		System.out.println(this.x);
		super.fun();
	}
}

class Super
{
	public static void main(java.lang.String args[])
	{
			Derived dobj = new Derived();
			dobj.gun();

	}
}




