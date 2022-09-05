package MultiThreading_ThreadSynchronisation;
class  PrinterMachine extends Thread
{
	synchronized void print()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted Exception Handled");
			}
		}
	}
}
class Printer extends Thread
{
	PrinterMachine p1;
	public Printer(PrinterMachine p1)
	{
		this.p1=p1;
	}
	@Override
	public void run()
	{
		p1.print();
	}
}
public class Test_Printer 
{
	public static void main(String[] args) 
	{
		PrinterMachine p1=new PrinterMachine();

		Printer user1=new Printer(p1);
		Printer user2=new Printer(p1);
		Printer user3=new Printer(p1);

		user1.start();
		user2.start();
		user3.start();
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
*	 
 */
