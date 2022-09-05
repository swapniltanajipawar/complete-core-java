//2.write a program on method overriding 
package Polymorphism;
class Employees
{
	void search(int id)
	{
		System.out.println("Employee ID is:"+id);
	}
	void search(String name)
	{
		System.out.println("Employee name is:"+name);
	}
}
class Employee1 extends Employees
{
	@Override
	void search(int id)
	{
		System.out.println("Employee Identity card No:"+id);
	}
}
public class Test_Employees
{
	public static void main(String[] args)
	{
		Employee1 e1=new Employee1();
		e1.search(22);
		e1.search("Dinga");
		e1.search(44);
		
	}
}
