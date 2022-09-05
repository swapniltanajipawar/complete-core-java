//3.Write a java Program to demonstrate Object class Properties in implementation class.
package Interface;

interface Sample5
{
  void totalStudent(int student);
}
class Sample6 implements Sample5
{
	@Override
	public void totalStudent(int student)
	{
		System.out.println("Details of PECE7 Batch:");
		System.out.println("Total Number of Student In Class: "+student);
		
	}
}
public class Sample4
{
	public static void main(String[] args)
	{
		Sample6 s6=new Sample6();
		s6.totalStudent(22);
	}
}
