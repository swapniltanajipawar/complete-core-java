package Collection_FrameWork_ArrayList;
import java.util.ArrayList;

public class Demo1 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList a1=new ArrayList();
		//ref.add(value); ->To insert value / element inside object

		a1.add(22);
		a1.add("Hi");
		a1.add(22);
		a1.add('A');
		a1.add(null);
		a1.add(8.9);

		//S.O.P(ref)-> all elements gets Printed
		System.out.println(a1);
		//ref.get(index);-> To retrieve specific elements as Random
		System.out.println(a1.get(3));//A
		// ref.add(index,value);->To perform middle insertion
		a1.add(3,"Oye");
		System.out.println(a1);
		//ref.remove(value);->To remove element
		a1.remove("Oye");
		System.out.println(a1);
		//ref.set(index,value);->To replace value
		a1.set(2, 99);
		System.out.println(a1);
		//ref.clear();->To clear entire element
		a1.clear();
		System.out.println(a1);

		a1.add(22);
		a1.add("Hi");
		a1.add(22);
		a1.add('A');
		a1.trimToSize();
		System.out.println(a1);

	}
}
