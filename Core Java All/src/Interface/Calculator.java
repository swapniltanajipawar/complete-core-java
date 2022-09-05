//Lambda Expression for zero Argument method
//A Interface with only one method ->Functional Interface
package Interface;
interface Data
{
	void add();
}
public class Calculator 
{
	public static void main(String[] args)
	{
		//Lambda expression (jdk 1.8v)->f.o.p
		Data d1=()->{
			int a=10;
			int b=20;
			System.out.println("a value is:"+a);
			System.out.println("b value is:"+b);
			System.out.println("Add. result is:"+(a+b));
		};
		//Lambda expression
		Data d2=()->System.out.println("Running add() method");
		d1.add();
		d2.add();
	}
}
