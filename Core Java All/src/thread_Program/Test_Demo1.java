package thread_Program;
class Demo1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("running run() method....");
	}
}
public class Test_Demo1 
{
	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		System.out.println("d1:"+d1);
		d1.start();

		System.out.println("-------------------------------------------");

		Demo1 d2=new Demo1();
		System.out.println("d2:"+d2);
		d2.start();
	}
}
/*
OUTPUT

d1:Thread[Thread-0,5,main]
--------------------------------------------
d2:Thread[Thread-1,5,main]
running run() method....
running run() method....

*/