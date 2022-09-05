//Abstract class and concrete class in terms of Hierarchical Inheritance
package Abstract;
abstract class Sample1  //Abstract class
{
	abstract void property1();  //incomplete method
	abstract void property2();  //incomplete method
	abstract void property3();  //incomplete method
}
abstract class Sample2  extends Sample1 //Abstract class
{
	@Override
	void property1()
	{
		System.out.println("1.Qspider software testing institute");
	}
	@Override
	void property2()
	{
		System.out.println("2.Jspider software Development institute");
	}

}
class Sample3 extends Sample2 //Concrete class
{
	@Override
	void property3()
	{
		System.out.println("Address of Institute:Sunny Plaza ");
		System.out.println("Infront of Z bridge, Deccan Pune ");
	}
}
 class Sample4  extends Sample1
{

	@Override
	void property1()
	{
		System.out.println("1.Qspider software testing institute");
	}
	@Override
	void property2()
	{
		System.out.println("2.Jspider software Development institute");
	}
	@Override
	void property3()
	{
		System.out.println("Address of Institute:Sunny Plaza ");
		System.out.println("Infront of Z bridge, Deccan Pune ");
	}
}

public class Test_Sample1_2_3_4 
{
	public static void main(String [] args)
	{
		Sample3 s3=new Sample3();
		s3.property1();
		s3.property2();
		s3.property3();
		System.out.println("---------------------------------------------");
		Sample4 s4=new Sample4();
		s4.property1();
		s4.property2();
		s4.property3();
	}
}
