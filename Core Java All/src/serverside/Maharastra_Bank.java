package serverside;
import customerside.BHIM;
public class Maharastra_Bank implements BHIM 
{
	public void checkBalance()
	{
		System.out.println("check bank balance of Maharastra_Bank");
	}
	public void transfer(double amt)
	{
		System.out.println("balance transfer from Maharastra_Bank "+amt);
	}
	public void payBill(double amt)
	{
		System.out.println("paybill by Maharastra_Bank"+amt);
	}
}
