//PROGRAM OF hashCode()

package Object_Class;
class Sample9
{

}
class Sample10 
{
	@Override
	public int hashCode()
	{
		return 0;
	}
}
public class Test_Sample1_2_3
{
	public static void main(String[] args)
	{
		Sample9 s9=new Sample9();
		System.out.println("S9:"+s9);
		System.out.println(s9.toString());
		System.out.println(s9.hashCode());
		System.out.println("---------------------------------------");
		Sample10 s10=new Sample10();
		System.out.println("S10:"+s10);
		System.out.println(s10.toString());
		System.out.println(s10.hashCode());
	}
}
/*
OUTPUT:

S9:Object_Class.Sample9@2f92e0f4
Object_Class.Sample9@2f92e0f4
798154996
---------------------------------------
S10:Object_Class.Sample10@0
Object_Class.Sample10@0
0

*/