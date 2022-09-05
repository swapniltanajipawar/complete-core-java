//5. Write a Java program to show Company and Employee relationship in Up Casting.
//UPCASTING EXAMPLE
package Casting;

class Employee
{
	void work()
	{

	}
	void salary(double salaryAmount)
	{

	}
}
class HR extends Employee
{   
	@Override
	void work()
	{
		System.out.println("work of HR: To hire new candidates"); 
	}
	@Override
	void salary(double salaryAmount)
	{
		System.out.println("salary of HR:"+salaryAmount);
	}
}
//Employee
class Engineer extends Employee
{   
	@Override
	void work()
	{
		System.out.println("work of Engineer:To develop/Test Application"); 
	}
	@Override
	void salary(double salaryAmount)
	{
		System.out.println("salary of Engineer:"+salaryAmount);
	}
}
public class Test_Employee_HR_Engineer
{
	public static void main(String [] args)
	{
		//super class=sub class
		Employee hr=new HR();
		hr.work();
		hr.salary(20000.0);
		System.out.println("--------------------------------------------");
		Employee Engineer=new Engineer();
		Engineer.work();
		Engineer.salary(45000.0);
	}
}
/*
 OUTPUT:-
 work of HR: To hire new candidates
salary of HR:20000.0
--------------------------------------------
work of Engineer:To develop/Test Application
salary of Engineer:45000.0

*/