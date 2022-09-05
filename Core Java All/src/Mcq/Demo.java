package Mcq;

public class Demo extends Thread
{
	public static void main(String[] args)
	{
		Demo t =new Demo();
		t.run();
		t.start();
	}
	public void run()
	{
		System.out.print("run-test ");
	}
}
/*
OUTPUT
run-test run-test 
*/