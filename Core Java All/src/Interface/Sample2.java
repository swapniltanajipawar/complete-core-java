package Interface;

interface Sample0
{
	void property1();
	void property2();
}
class Sample1 implements Sample0
{
	@Override
	public void property1()
	{
		System.out.println("This is Property of 1");
	}
	@Override
	public void property2()
	{
		System.out.println("This is Property of 2");
	}

}
public class Sample2
{
	public static void main(String[] args) 
	{
		Sample0 s0=new Sample1();
		s0.property1();
		s0.property2();
	}
}