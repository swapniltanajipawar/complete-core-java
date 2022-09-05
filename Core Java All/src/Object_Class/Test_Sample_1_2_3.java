//Question OF toString()

package Object_Class;
class Sample4
{
	public String toString()
	{
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
}
class Sample5 extends Sample4
{
	@Override
	public String toString()
	{
		return "Hi";
	}
}
class Sample6 extends Sample5
{

}
public class Test_Sample_1_2_3
{
	public static void main(String [] args)
	{
		Sample4 s4=new Sample4();
		System.out.println("S4:"+s4);
		System.out.println(s4.getClass());
		System.out.println(s4.getClass().getName());
		Sample5 s5=new Sample5();
		System.out.println("S5:"+s5);
		Sample6 s6=new Sample6();
		System.out.println("S6:"+s6);
		System.out.println("S4:"+s4);
		
	}
}
/*
OUTPUT:

S4:Object_Class.Sample4@2f92e0f4
S5:Hi
S6:Hi
S4:Object_Class.Sample4@2f92e0f4

*/