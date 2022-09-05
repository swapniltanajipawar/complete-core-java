package MultiThreading_ThreadSynchronisation;

class Demo5 extends Thread
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
public class Test_Demo5
{
	public static void main(String[] args)
	{
		Demo5 d5=new Demo5();
		Demo5 d6=new Demo5();
		Demo5 d7=new Demo5();

		d5.start();
		d6.start();
		d7.start();

	}
}
