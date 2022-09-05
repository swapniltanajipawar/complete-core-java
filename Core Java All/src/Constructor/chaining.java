//6. Write a Java program to perform constructor chaining operation.
package Constructor;

class Demo8
{
	Demo8(int a)
	{
		this("Hi");
		System.out.println("running integer-argument constructor");
	}
	Demo8(String s)
	{
		System.out.println("running String-argument constructor");
	}
}
public class chaining
{
	public static void main(String [] args)
	{
		Demo8 d8=new Demo8(8);
	}
}