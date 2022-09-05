package serverside;
import customerside.BHIM;
public class Icici_Bank implements BHIM
{
	public void checkBalance()
	{
		System.out.println("check bank balance of Icici_Bank");
	}
	public void transfer(double amt)
	{
		System.out.println("balance transfer from Icici_Bank "+amt);
	}
	public void payBill(double amt)
	{
		System.out.println("paybill by Icici_Bank"+amt);
	}
}
