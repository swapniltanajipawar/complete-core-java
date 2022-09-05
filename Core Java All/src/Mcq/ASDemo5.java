package Mcq;
class access
{

	public int x;
	private int y;
	void cal(int a, int b)
	{
		x = a + 1;
		y = b;
	}
	void print()
	{
		System.out.println(y);
	}
}
public class ASDemo5
{
	public static void main(String args[])
	{
		access obj = new access();
		obj.cal(2, 3);
		System.out.print(obj.x+" ");
		obj.print();
	}
}


