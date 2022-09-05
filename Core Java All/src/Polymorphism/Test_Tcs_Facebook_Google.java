/*5. Write a Java program to show salary Hike in second and 3rd company. 
Where method call should be salaryDetails() for all the company.*/
package Polymorphism;
abstract class Company
{
	abstract void companyName();
	abstract void salaryDetail();
	abstract void jobDesignation();
}
class Tcs extends Company
{
	void companyName()
	{
		System.out.println("Company name is:TCS");
	}
	void salaryDetail()
	{
		System.out.println("Annual Salary is:4.5 LPA");
	}
	void jobDesignation()
	{
		System.out.println("Job Role:System Engineer");
	}
}
class Wipro extends Company
{
	void companyName()
	{
		System.out.println("Company name is:Facebook");
	}
	void salaryDetail()
	{
		System.out.println("Annual Salary is: 20 LPA");
	}
	void jobDesignation()
	{
		System.out.println("Job Role:Senior Software Developer");
	}
}
class Google extends Company
{
	void companyName()
	{
		System.out.println("Company name is:Google");
	}
	void salaryDetail()
	{
		System.out.println("Annual Salary is:35 LPA");
	}
	void jobDesignation()
	{
		System.out.println("Job Role:Senior Software Developer");
	}
}

public class Test_Tcs_Facebook_Google 
{
	public static void main(String[] args)
	{
		Tcs t1=new Tcs();
		t1.companyName();
		t1.salaryDetail();
		t1.jobDesignation();

		Wipro w1=new Wipro();
		w1.companyName();
		w1.salaryDetail();
		w1.jobDesignation();

		Google g1=new Google();
		g1.companyName();
		g1.salaryDetail();
		g1.jobDesignation();

	}
}
