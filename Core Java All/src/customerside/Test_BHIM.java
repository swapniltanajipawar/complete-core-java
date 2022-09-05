package customerside;

import serverside.Kotak_Bank;
/*
import serverside.Maharastra_Bank;
import serverside.Icici_Bank;
 */
public class Test_BHIM 
{
	public static void main(String[] args)
	{
		BHIM b1=new Kotak_Bank();
		b1.checkBalance();
		b1.transfer(10000);
		b1.payBill(5000);
		/*
		BHIM b1=new Maharastra_Bank();
		b1.checkBalance();
		b1.transfer(4000);
		b1.payBill(5000);
		BHIM b1=new Icici_Bank();
		b1.checkBalance();
		b1.transfer(9000);
		b1.payBill(200);
		 */

	}
}
