//2. Write a program to access non static members of the class where constructor is declared as private (2 ways).
package Private_classMember;
class Calculator
{int a=10;
int b=5;
private Calculator()
{
	System.out.println("running private constructor");
}
void add()
{   System.out.println("a value is:"+a);
System.out.println("b value is:"+b);
System.out.println("Add. value is:"+(a+b));
}
static Calculator getCalculatorObject()
{
	Calculator c=new Calculator();
	System.out.println("c:"+c);
	return c;
}
}
public class Test_Calculator
{
	public static void main(String [] args)
	{
		Calculator c1=Calculator.getCalculatorObject();
		/*Due to private constructor we cant create object of Calculator class
	     so to access class calculator , we use static method method of return type becaz that can be
	     accessed with help of className so ultimately it will return object address of Calculator Class.
		 */
		System.out.println("c1:"+c1);
		c1.add();
		System.out.println("----------------------------------------");
		Calculator c2=Calculator.getCalculatorObject();
		System.out.println("c2:"+c2);
		c2.add();
		System.out.println("----------------------------------------");
		c1.a=44;
		c2.b=12;
		c1.add();
		System.out.println("----------------------------------------");
		c2.add();
		System.out.println("----------------------------------------");
		Calculator c3=Calculator.getCalculatorObject();
		System.out.println("c3:"+c3);
		c3.add();
	}
}
