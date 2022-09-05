//current thread
package thread_Program;

public class Demo4 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method running......");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		Thread t=Thread.currentThread();
		System.out.println(t);
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName);
		
	}
}
/*
OUTPUT:

Main method running......
Thread[main,5,main]
main
Thread[main,5,main]
main

*/