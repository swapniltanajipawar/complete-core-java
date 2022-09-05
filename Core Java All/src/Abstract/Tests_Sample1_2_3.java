//Abstract class and Concrete class with combination of multi-level inheritance
package Abstract;
abstract class Sample1  //Abstract class
{
	abstract void property1();  //incomplete method
	abstract void property2();  //incomplete method
	abstract void property3();  //incomplete method
	void property0()
	{
		System.out.println("Best software Institute in Pune");
	}
}
abstract class Sample2  extends Sample1 //Abstract class
{	@Override
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
{	@Override
	void property3()
{
	System.out.println("Address of Institute:Sunny Plaza ");
	System.out.println("Infront of Z bridge, Deccan Pune ");
}
}
public class Tests_Sample1_2_3 
{
	public static void main(String [] args)
	{	//Sample1 s1=new Sample1(); error (As this as abstract class so we can't do object creation). 
		//Sample2 s2=new Sample2(); error (As this as abstract class so we can't do object creation).
		Sample3 s3=new Sample3(); //Done Successfully
		Sample2 s2=new Sample3();
		s2.property1();
		s2.property2();
		s2.property3();
		s2.property0();
		s3.property0();
	}
}
