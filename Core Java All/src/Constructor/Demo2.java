//8. Write a program to make constructor call explicitly to achieve constructor chaining operation.
package Constructor;

class Demo3
{
	Demo3()
	{
		System.out.println("running zero-argument constructor");
	}
	Demo3(int a)
	{
		this("Hi");
		System.out.println("running integer-argument constructor");
	}
	Demo3(String s)
	{
		this();
		System.out.println("running String-argument constructor");
	}

}
public class Demo2
{
	public static void main(String [] args)
	{
		Demo3 d3=new Demo3(10);
	}
}