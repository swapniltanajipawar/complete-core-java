//Abstract class and anonymous class
package Anonymous;
abstract class Demo1 
{
	abstract void Job();
	abstract void Bussiness();

}
public class Test_Demo1
{
	public static void main(String [] args)
	{
		// Demo1 d1=new Demo1();------------->error
		//Anonymous class
		Demo1 d1=new Demo1()
		{
			@Override
			void Job()
			{
				System.out.println("Job fix income / salary.");
				System.out.println("It is depends upon the our work and responsibility in the Company.....");
			}
			@Override
			void Bussiness()
			{
				System.out.println("Bussiness in which full of responsibility on owner and can get");
				System.out.println("More profit by hiring more employees for work.......");
			}
		};
		d1.Job();
		d1.Bussiness();
	}
}