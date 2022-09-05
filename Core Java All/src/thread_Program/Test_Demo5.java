//Thread Object: Life Cycle

package thread_Program;
class Demo5 extends Thread
{
	@Override
	public void run()
	{
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName+":RUNNING");
	}
}
public class Test_Demo5 
{
	public static void main(String[] args)
	{
		Demo5 d1=new Demo5();
		Demo5 d2=new Demo5();
		Demo5 d3=new Demo5();
		System.out.println(d1.getName()+":"+d1.getState());
		System.out.println(d2.getName()+":"+d2.getState());
		System.out.println(d3.getName()+":"+d3.getState());
		System.out.println("-----------------------------------------------------");

		d1.start();
		System.out.println(d1.getName()+":"+d1.getState());
		System.out.println(d2.getName()+":"+d2.getState());
		System.out.println(d3.getName()+":"+d3.getState());
		System.out.println("-------------------------------------------------------");

		d2.start();
		System.out.println(d1.getName()+":"+d1.getState());
		System.out.println(d2.getName()+":"+d2.getState());
		System.out.println(d3.getName()+":"+d3.getState());
		System.out.println("--------------------------------------------------------");

		d3.start();
		System.out.println(d1.getName()+":"+d1.getState());
		System.out.println(d2.getName()+":"+d2.getState());
		System.out.println(d3.getName()+":"+d3.getState());
		System.out.println("----------------------------------------------------------");
	}
}
/*
OUTPUT:

Thread-0:NEW
Thread-1:NEW
Thread-2:NEW
-----------------------------------------------------
Thread-0:RUNNABLE
Thread-1:NEW
Thread-2:NEW
-------------------------------------------------------
Thread-0:RUNNABLE
Thread-1:RUNNABLE
Thread-2:NEW
--------------------------------------------------------
Thread-0:RUNNABLE
Thread-1:RUNNABLE
Thread-2:RUNNABLE
----------------------------------------------------------
Thread-0:RUNNING
Thread-2:RUNNING
Thread-1:RUNNING

*/