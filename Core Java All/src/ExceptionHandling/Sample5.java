package ExceptionHandling;

class Sample6
{
	void test() throws InterruptedException//compile time exception handled at top of the stack
	{               //not handle in current stack thats why it propageted in the previous stack
		System.out.println("test() method started");
		Thread.sleep(2000);
		System.out.println("test() method ended" );
	}
	void view() throws InterruptedException
	{
		System.out.println("running view method");
		test();//in this stack also exception not handled so it will propagate exception to the caller method or 
	}
}
public class Sample5
{
	public static void main(String[] args) 
	{
		Sample6 s6=new Sample6();
		s6.view();//Now exception is here
	}
}
