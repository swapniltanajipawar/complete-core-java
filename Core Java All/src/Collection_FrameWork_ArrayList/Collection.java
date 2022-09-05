package Collection_FrameWork_ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Collection 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(0);
		a1.add(22);
		a1.add(11);
		a1.add(66);
		a1.add(29);
		a1.add(55);
		a1.add(22);

		System.out.println(a1);//[0, 22, 11, 66, 29, 55, 22]
		System.out.println(Collections.max(a1));//66
		System.out.println(Collections.min(a1));//0
		System.out.println(Collections.frequency(a1,22));//2
		Collections.sort(a1);
		System.out.println(a1);////[0, 11, 22, 22, 29, 55, 66]
		Collections.reverse(a1);
		System.out.println(a1);//
		Collections.swap(a1,0,1);//[66, 55, 29, 22, 22, 11, 0]
		Collections.shuffle(a1);
		System.out.println(a1);//[55, 66, 29, 0, 22, 22, 11]
		Collections.replaceAll(a1,22,99);
		System.out.println(a1);//[55, 66, 29, 0, 99, 99, 11]
		
	}
}
