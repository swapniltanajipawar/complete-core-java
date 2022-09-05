//8.Write a java Program to achieve multiple inheritance using default method. 
//Where super interface must be having common methods. Invoke all the methods.
package Interface;
interface BreakFast
{
	default void tea(int tea)
	{    
		double teaPrice=1000.0;
		System.out.println("Break Fast Tea");
		System.out.println("Taj One tea price:Rs"+teaPrice);
	}
	void Coffee(int Cof);
}
interface Dinner_BreakFast
{
	default void tea(int tea)
	{    
		double teaPrice=1000.0;
		System.out.println("Taj One tea price:Rs"+teaPrice);
	}
	void coffee(int cof);
}
class Taj implements BreakFast , Dinner_BreakFast
{
	@Override
	public void tea(int tea) 
	{
		double teaPrice=1200.0;
		System.out.println("Taj One tea price:Rs"+teaPrice);
		System.out.println("Total Bill of Tea:"+tea*teaPrice);

	}

	@Override
	public void Coffee(int Cof) 
	{
		double coffeePrice=1500.0;
		System.out.println("Taj one coffee price:Rs"+coffeePrice);
		System.out.println("Total Bill of Coffee:"+Cof*coffeePrice);
	}
}
public class Hotel_Taj
{
	public static void main(String[] args) 
	{
		System.out.println("              Bill Receipt        [31 Dec 2021 & 11.55PM]   ");
		System.out.println("Customer Name-Swapnil Pawar");
		Taj t1=new Taj();
		t1.tea(5);
		t1.Coffee(4);
		System.out.println("----------Thank You Visit Again To TAJ HOTEL-------------------");
	}
}