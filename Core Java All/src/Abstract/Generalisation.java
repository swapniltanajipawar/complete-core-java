package Abstract;

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
		System.out.println("check bank balance Axix_Bank");
		
	}
	void transfer(double amt)
	{
		System.out.println("balance transfer from Axix_Bank "+amt);
	}
	void payBill(double amt)
	{
		System.out.println("paybill by Axix_Bank "+amt);
	}

}

public class Generalisation
{
	public static void main(String[] args)
	{

       //super class= sub class
		/*Bhim b1=new Icici_Bank();
		b1.checkBalance();
		b1.transfer(10000);
		b1.payBill(5000);
		 */
		Bhim b1=new Hdfc_Bank();
		b1.checkBalance();
		b1.transfer(200);
		b1.payBill(100);
		
	/*	Bhim b1=new Axix_Bank();
		b1.checkBalance();
		b1.transfer(400.25);
		b1.payBill(600.45);
		*/
	}
}
/*
OUTPUT:

Bhim b1=new Icici_Bank();
check bank balance of Icici_Bank
balance transfer from Icici_Bank 10000.0
paybill by Icici_Bank5000.0
------------------------------------------------------
Bhim b1=new Hdfc_Bank();
check bank balance of Hdfc_Bank
balance transfer from Hdfc_Bank 200.0
paybill by Hdfc_Bank100.0
------------------------------------------------------
Bhim b1=new Axix_Bank();
check bank balance Axix_Bank
balance transfer from Axix_Bank400.25
paybill by Axix_Bank600.45

 */
