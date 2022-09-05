//2.2. Write a program to create subclass for implementation class.
package Interface;

interface sample_A
{
	void property1();
	void property2();
	void property3();
}
abstract class Sample_B implements sample_A
{
	@Override
	public void property1()
	{
		System.out.println("This is property of 1");
	}
	@Override
	public void property2()
	{
		System.out.println("This is property of 2");
	}
}
class Sample_C extends Sample_B
{
	@Override
	public void property3()
	{
		System.out.println("This is property of 3");
	}

}
public class Sample_D
{
	public static void main(String[] args)
	{
		Sample_C c1=new Sample_C();
		c1.property1();
		c1.property2();
		c1.property3();
	}
}


