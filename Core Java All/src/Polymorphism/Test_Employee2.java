//3.Write a program on Run time Polymorphism
package Polymorphism;
class Employee2
{
	void search1(int id)
	{
		System.out.println("Employee ID is:"+id);
	}
	void search1(String name)
	{
		System.out.println("Employee Name is:"+name);
	}
}
public class Test_Employee2 
{
	public static void main(String[] args) 
	{
		Employee2 e2=new Employee2();
		e2.search1(55);
		e2.search1("Samba");
	}
}
