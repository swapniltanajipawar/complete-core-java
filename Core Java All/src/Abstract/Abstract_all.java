//Que-Access specifier or modifier for abstract method.
package Abstract;

//public abstract final class Abstract_all->error->final class can't be inherite by other java class
public abstract class Abstract_all
{
	public abstract void test();
	protected abstract void test(int i);
	abstract void test(double b);//Default access specifier
	//private abstract void test test(chat c);->error ->it can't be override
	//static abstract void test1(double b);->error->static method can't be overrided
	//final abstract void test2(double b);->error->final method can't be overrided
}
