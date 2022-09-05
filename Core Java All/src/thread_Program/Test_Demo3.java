//Thread Object Properties

package thread_Program;
class Demo3 extends Thread
{
	@Override
	public void run()
	{
		System.out.println(" running run() method............");
	}
}
public class Test_Demo3
{
	public static void main(String[] args) 
	{
		Demo3 d3=new Demo3();
		System.out.println("d3:"+d3);
		//ID
		System.out.println("Id:"+d3.getId());
		//d3.setId(22);---->error
		//Name
		System.out.println("Name:"+d3.getName());
		d3.setName("Demo3");
		System.out.println("Name:"+d3.getName());
		//Priority
		System.out.println("Priority:"+d3.getPriority());
		d3.setPriority(8);
		System.out.println("Priority:"+d3.getPriority());
		d3.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority:"+d3.getPriority());
		d3.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Priority:"+d3.getPriority());
		//State
		System.out.println("State:"+d3.getState());
		//Type
		System.out.println("IsDaemon?:"+d3.isDaemon());
		//d3.start();
		d3.setDaemon(true);
		System.out.println("IsDaemon?:"+d3.isDaemon());
		//state
		System.out.println("IsAlive?:"+d3.isAlive());
	}	
}
/*OUTPUT:
 
d3:Thread[Thread-0,5,main]
Id:13
Name:Thread-0
Name:Demo3
Priority:5
Priority:8
Priority:1
Priority:10
State:NEW
IsDaemon?:false
IsDaemon?:true
IsAlive?:false

*/