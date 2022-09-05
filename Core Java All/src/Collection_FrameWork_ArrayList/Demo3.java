package Collection_FrameWork_ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
class student
{
	String name;
	int yop;
	student(String name, int yop)
	{
		this.name=name;
		this.yop=yop;
	}
	@Override
	public String toString()
	{
		return name+" "+yop;
	}
}
class Teacher
{

}
public class Demo3 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		student st[]=new student[5];
		st[0]=new student("Samba",2020);
		st[3]=new student("Ranga",2019);
		System.out.println("Student elements are:");
		for(int i=0; i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		System.out.println("----------------------------------------------");

		ArrayList stData=new ArrayList();
		stData.add(new student("Samba",2020));
		stData.add(new student("Dinga",2022));
		stData.add(new student("Bunga",2018));
		stData.add(new student("Ranga",2019));
		stData.add(new Teacher());
		System.out.println("ArrayList object elements:");

		Iterator it=stData.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
