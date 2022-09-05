//current thread

package thread_Program;
class Gate1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("running run() method.....");
		System.out.println(Thread.currentThread().getName());

		String s=Thread.currentThread().getName();
		System.out.println("Current thread name:"+s);
	}
}
public class Test_Gate1 
{
	public static void main(String[] args) 
	{
		Gate1 g1=new Gate1();
		g1.start();
	}
}
/*

OUTPUT:

running run() method.....
Thread-0
Current thread name:Thread-0

*/