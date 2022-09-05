package Interface;
interface Mobile
{
	void display(String type);
	void price(double amount);
	void warranty(int years);
}
interface Laptop
{
	void display(String type);
	void price(double amount);
}
class Gadget implements Mobile,Laptop
{
	@Override 
	public void display(String type)
	{
		System.out.println("Display type:"+type);
	}
	@Override
	public void price(double amount)
	{
		System.out.println("price:"+amount);
	}
	@Override
	public void warranty(int years)
	{
		System.out.println("Warranty in years:"+years);
	}
}
public class Test_Gadget 
{
public static void main(String[] args)
{
	Gadget g1=new Gadget();
	g1.display(null);
	g1.price(0.0);
	g1.warranty(0);
	System.out.println("---------------------------------------");
	Mobile m1=new Gadget();
	m1.display(null);
	m1.price(0.0);
	m1.warranty(0);
	Laptop l1=new Gadget();
	l1.display(null);
	l1.price(0.0);
}
}
