//5. Write a Java program to make explicit constructor call operation.
package Constructor;

class Demo10
{
	Demo10(int a)
	{
		System.out.println("running integer-argument constructor");
	}

}
public class Demo4
{
	public static void main(String [] args)
	{
		Demo10 d10=new Demo10(10);
	}

}
