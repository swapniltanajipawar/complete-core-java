//6.WRITE A PROGRAM TO ACHIEVE MULTIPLE INHERITANCE AND SHOW SUB CLASS INTERFACE INHERITS PROPERTIES
// FROM ABSTRACT CLASS AND INTERFACE SIMELTANIOUSLY
package Interface;
abstract class Demo15
{
	abstract void indianFreedom(); 
}
interface Demo16
{
	void indFreeStrugle();
}
class Demo17 extends Demo15 implements Demo16
{
	void indianFreedom()
	{
		System.out.println("INDIA GOT FREEDOM FROM BRITISH EMPERIOR ON 15 AUG 1947");
	}
	public void indFreeStrugle()
	{
		System.out.println("INDIA FIGHT FOR INDEPENCE FROM 1857,1919,1922,1930,1942");
	}
}
public class Test_Demo20 
{
	public static void main(String[] args) 
	{
		System.out.println("                              * INDIAN HISTORY *                                              ");
		System.out.println("----------------------------------------------------------------------------------------");
		Demo17 d1=new Demo17();
		d1.indianFreedom();
		Demo16 d2=new Demo17();
		d2.indFreeStrugle();
		System.out.println("RESPECT OUR INDEPENDENCE AND SAVE IT FROM FOREIGN COUNTRIES ");

	}
}
