//2.Write a program to Achieve Loose Coupling in Abstraction
package Abstraction_LooseCoupling;
abstract class Bhim
{
	abstract void checkBalance();
	abstract void transfer(double amt);
	abstract void payBill(double amt);
}
class Icici_Bank extends Bhim
{
	void checkBalance()
	{
		System.out.println("check bank balance of Icici_Bank");
	}
	void transfer(double amt)
	{
		System.out.println("balance transfer from Icici_Bank "+amt);
	}
	void payBill(double amt)
	{
		System.out.println("paybill by Icici_Bank"+amt);
	}

}
class Hdfc_Bank extends Bhim
{
	void checkBalance()
	{
		System.out.println("check bank balance of Hdfc_Bank");
	}
	void transfer(double amt)
	{
		System.out.println("balance transfer from Hdfc_Bank "+amt);
	}
	void payBill(double amt)
	{
		System.out.println("paybill by Hdfc_Bank"+amt);
	}

}
class Axix_Bank extends Bhim
{
	void checkBalance()
	{
		System.out.println("Check bank balance Axix Bank");
	}
	void transfer(double amt)
	{
		System.out.println("Balance transfer from Axix Bank:"+amt);
	}
	void payBill(double amt)
	{
		System.out.println("Paybill by Axix Bank:"+amt);
	}

}

public class Generalisation
{
	public static void main(String[] args)
	{


		/*Bhim b1=new Icici_Bank();
		b1.checkBalance();
		b1.transfer(10000);
		b1.payBill(5000);
		 */
		/*Bhim b1=new Hdfc_Bank();
		b1.checkBalance();
		b1.transfer(200);
		b1.payBill(100);
		 */
		Bhim b1=new Axix_Bank();
		b1.checkBalance();
		b1.transfer(400.25);
		b1.payBill(600.45);
	}
}
