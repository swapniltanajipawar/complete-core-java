package MultiThreading_ThreadSynchronisation;

class Demo1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println("Inturrepted Exception Handled");
			}
		}
	}
}
public class Test_Demo1
{
	public static void main(String[] args) throws InterruptedException
	{
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1();
		Demo1 d3=new Demo1();

		d1.start();
		d1.join();
	
		d2.start();
		d2.join();
		
		d3.start();

	}
}
/*
 
OUTPUT:

1
2
3
4
5
1
2
3
4
5
1
2
3
4
5

*/