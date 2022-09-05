package thread_Program;
class Demo06 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println("Running CHILD thread");
		}
	}
}
public class Test_Demo6 
{
	public static void main(String[] args) 
	{
		Demo06 d6=new Demo06();
		d6.start();
		for(int i=0; i<=5; i++)
		{
			Thread.yield();//slow down current thread execution and giving opportunity
			//to get execute the other threads.
			System.out.println(i);
		}
	}
}
/*
OUTPUT
without yield
0
1
2
3
4
5
Running CHILD thread
Running CHILD thread
Running CHILD thread
Running CHILD thread
Running CHILD thread
Running CHILD thread

with yield
Running CHILD thread
Running CHILD thread
Running CHILD thread
Running CHILD thread
Running CHILD thread
Running CHILD thread
0
1
2
3
4
5

*/