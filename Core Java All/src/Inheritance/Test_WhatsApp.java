//2. Write a program on multilevel inheritance.
package Inheritance;

class WhatsApp_v1
{
	void texting()
	{
		System.out.println("texting feature is available");
	}
}
class WhatsApp_v2 extends WhatsApp_v1
{
	void multimedia()
	{
		System.out.println(" multimedia feature is available");
	}
}
class WhatsApp_v3 extends  WhatsApp_v2
{
	void calling()
	{
		System.out.println(" calling feature is available");
	}
}
public class Test_WhatsApp
{
	public static void main(String [] args)
	{
		WhatsApp_v1 v1=new WhatsApp_v1();
		v1.texting();
		System.out.println("----------------------------------");
		WhatsApp_v2 v2=new WhatsApp_v2();
		v2.texting();
		v2.multimedia();
		System.out.println("----------------------------------");
		WhatsApp_v3 v3=new WhatsApp_v3();
		v3.texting();
		v3.multimedia();
		v3.calling();


	}
}