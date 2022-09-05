package Collection_FrameWork_ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class Arralist
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();

		a1.add(22);
		a1.add("Hi");
		a1.add('A');
		a1.add(5.8);
		a1.add(null);
		Iterator it=a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("--------------------------------------------------");
		
		a1.set(2,"Hello");
		a1.remove("Hello");
		a1.add(0,"Good Morning");
		System.out.println(a1.get(0));
		System.out.println(a1);
		System.out.println(a1.contains("Good Morning"));
		
	}
}
