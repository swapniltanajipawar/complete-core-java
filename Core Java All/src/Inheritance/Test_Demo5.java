//7.WRITE A JAVA PROGRAM TO SHOW A DIFFERENCE BETWEEN IMPLEMENTATION CLASS, ANONYMOUS CLASS AND LAMBDA EXPRESSION
package Inheritance;
interface Demo4
{
	void vaccine();
}
class Demo5 implements Demo4//Implementation class
{
	public void vaccine()
	{
		System.out.println("CORONA VACCINE:COVISHILD BY ASTRAZINICA & OXFORD UNIVERSITY MANUFACTURED BY SERUM INSTITUTE");
		System.out.println("--------------------------------------------------------------------------------------------");
	}
	//Lambda Expression
	Demo4 d4=()->
	{   System.out.println("OUTPUT OF LAMBDA EXPRESSION CLASS:");
		System.out.println("CORONA VACCINE BY INDIAN COMPANY:BHARAT BIOTECH ");
		System.out.println("CORONA VACCINE BY INDIAN COMPANY:ZYDUS CADILA");
		System.out.println("--------------------------------------------------------------------------------------------");
	};
}
public class Test_Demo5 
{
	public static void main(String[] args) 
	{
		System.out.println("                                * WORLD VACCINES STATUS *                                          ");
		System.out.println("--------------------------------------------------------------------------------------------");
		//implementation class
		System.out.println("OUTPUT OF IMPLEMENTATION CLASS:");
		Demo5 d5=new Demo5();
		d5.vaccine();
		d5.d4.vaccine();
		System.out.println("OUTPUT OF ANONYMOUS CLASS:");
		Demo4 d4=new Demo4()
		{
			@Override
			public void vaccine()
			{
				System.out.println("CORONA VACCINE BY RUSSIAN GOVERMENT:SPUTNIK V");
				System.out.println("--------------------------------------------------------------------------------------------");
			}
		};
		d4.vaccine();
		System.out.println("NOTE:VACCINES WILL COME SOON BUT NEED TO FOLLOW SOCIAL DISTANCER");
		System.out.println("AND WEAR MASK AND WASH HANDCE REPEATEDLY BY SOAP OR SANITIZE");

	}
}