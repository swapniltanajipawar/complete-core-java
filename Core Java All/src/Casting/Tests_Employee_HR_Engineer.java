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
		System.out.println("work of HR: hire new candidates"); 
	}
	@Override
	void salary(double salaryAmount)
	{
		System.out.println("salary of HR:"+salaryAmount);
	}
	void Post()
	{
		System.out.println("Works as hr");
	}
}
//Tests_Employee_HR_Engineer
class Engineer extends Employee
{   
	@Override
	void work()
	{
		System.out.println("work of HR: hire new candidates"); 
	}
	@Override
	void salary(double salaryAmount)
	{
		System.out.println("salary of HR:"+salaryAmount);
	}

	void Posts()
	{
		System.out.println("Works as Engineer");
	}
}
public class Tests_Employee_HR_Engineer
{
	public static void main(String [] args)
	{
		Employee hr=new HR();
		HR h1=(HR)hr;
		hr.work();
		hr.salary(20000.0);
		h1.work();
		h1.Post();
		h1.salary(20000.0);
		System.out.println("--------------------------------------------");
		Employee E1=new Engineer();
		Engineer e1=(Engineer)E1;
		E1.work();
		E1.salary(45000.0);
		e1.work();
		e1.Posts();
		e1.salary(20000.0);
		
		
	}
}