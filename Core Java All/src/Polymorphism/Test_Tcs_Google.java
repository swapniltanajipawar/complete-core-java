package Polymorphism;
interface CompanyName
{
	void companyName(String CompName);
	void jobDesignation(String designation);
}
class Tcs implements CompanyName
{
	public void companyName(String CompName)
	{
		System.out.println("Company name is:"+CompName);
	}
	public void jobDesignation(String designation)
	{
		System.out.println("Job Role:"+designation);
	}
}

public class Test_Tcs_Google 
{
	public static void main(String[] args) 
	{
		Tcs t1=new Tcs();
		t1.companyName("Tcs");
		t1.jobDesignation("Software Developer");
	}
}