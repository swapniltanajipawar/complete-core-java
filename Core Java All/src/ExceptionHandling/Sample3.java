//Compile time exception get get generated at test() method/stack and exception 
//get handled inside same method /stack.
package ExceptionHandling;

class Sample4
{
	void test()
	{
		System.out.println("test() started");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted Exception handled");
		}
		System.out.println("test() ended");
	}

}
public class Sample3
{
	public static void main(String[] args)
	{
		Sample4 s4=new Sample4();
		s4.test();
	}
}
