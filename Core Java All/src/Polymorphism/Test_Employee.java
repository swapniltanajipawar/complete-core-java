//1. Write a program on method overloading.
package Polymorphism;
class Employee
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
public class Test_Employee
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.search(22);
		e1.search("Dinga");
	}
}
