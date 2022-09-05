package Random_Scanner;

import java.util.Random;
import java.util.Scanner;

class OTP
{
	void otpGenerator(int digitLimit)
	{
		Random r1=new Random();
		int RandomNumber=r1.nextInt(10000);
		String s1=String.valueOf(RandomNumber);
		int totalDigits=s1.length();
		if(totalDigits==digitLimit)
		{
			System.out.println("Otp is:"+RandomNumber);

		}
		else
		{
			otpGenerator(digitLimit);

		}
	}
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many digit you want ");
		int digitLimit=scan.nextInt();
		OTP o1=new OTP();
		o1.otpGenerator(digitLimit);
		//o1.otpGenerator(5);
		scan.close();

	}
}
