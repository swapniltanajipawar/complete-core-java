package thread_Program;
class Sample1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("runnable run() method");
	}
}
public class Test_Sample1 
{
	public static void main(String[] args)
	{
		Sample1 s1=new Sample1();
		System.out.println("s1:"+s1);
		Thread t1=new Thread(s1);
		System.out.println("t1:"+t1);
		t1.start();
		System.out.println("----------------------------------");
		Thread t2=new Thread(new Sample1());
		System.out.println("t2:"+t2);
		t2.start();

	}
}
