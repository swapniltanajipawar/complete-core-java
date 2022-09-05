//4. Write a Java program on ATM amount withdrawal operation. Where casting should be achieved.
//Display the withdrawal amount (Design a receipt).
package Casting;

import java.util.Scanner;

public class ATM 
{
	double accBal=100000.0;
	void checkAccountBalance()
	{   
		System.out.println("FROM A/C   00XXXXXXXXXX576");
		System.out.println("AVAIL BAL   Rs."+accBal);
		System.out.println("NOTE-PLEASE DON'T SHARE ATM PIN TO ANYONE. ");
		System.out.println("BANK NEVER ASK CONFIDENTIAL INFORMATION OF ACCOUNT.");
	}
	void withdraw(double amount1)
	{
		accBal=accBal-amount1;
		System.out.println("WITHDRAWAL  Rs."+amount1);
	}

	public static void main(String [] args)
	{  
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Amount to be Withdrawal :");
		int amount=scan.nextInt();
		System.out.println("----------------------------------------------");
		System.out.println("               ATM RECEIPT                    ");
		System.out.println("SBI DECCAN JIMKHANA PUNE ");
		ATM a1=new ATM(); 
		double amount1=(double)amount;
		a1.withdraw(amount1);
		a1.checkAccountBalance();

	}
}
