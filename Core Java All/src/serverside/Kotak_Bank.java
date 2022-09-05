package serverside;
import customerside.BHIM;
public class Kotak_Bank implements BHIM
{
	public void checkBalance()
	{
		System.out.println("Check Bank Balance Of Kotak Bank:");
	}
	public void transfer(double amt)
	{
		System.out.println("Balance Transfer From Kotak Bank:"+amt);
	}
	public void payBill(double amt)
	{
		System.out.println("Paybill By Kotak Bank:"+amt);
	}
}
