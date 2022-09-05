//1. Write a Java program to demonstrate the effectiveness of Inheritance.
package Inheritance;
//suoer class
class Company1
{
	String companyName="Wipro";
	String companyLocation="Pune";

	void company()
	{   System.out.println("Company Detail:");
	System.out.println("Company Name is:"+companyName);
	System.out.println("Company Location is:"+companyLocation);
	}
}
//Sub class
class Employee extends Company1
{
	String employeeName="Samba";
	int employeeId=84;
	String employeeDesignation="Software Engineer";

	void employee()
	{
		System.out.println("Employee Detail:");
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee Designation :"+employeeDesignation);
	}
}
public class Test_Company1
{
	public static void main(String [] args)
	{
		Company1 c1=new Company1();
		c1.company();
		System.out.println("-------------------------------------------");
		Employee e1=new Employee();
		e1.employee();
		e1.company();
	}
}