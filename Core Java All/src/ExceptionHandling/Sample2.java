//compile time Exception using throws declaration
package ExceptionHandling;

public class Sample2 
{
	public static void main(String[] args) throws Throwable//throws InterruptedException
	{
		System.out.println("Main method started");
		Thread.sleep(2000);
		System.out.println("main method ended");
	}
}
