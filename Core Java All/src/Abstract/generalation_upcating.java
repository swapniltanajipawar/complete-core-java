package Abstract;
abstract class employee
{
	abstract void detail();
	abstract void educationDetail();
	abstract void workHistory();
}
class developer  extends employee
{
	void detail()
	{
		System.out.println("Detail of developer ");
	}
	void educationDetail()
	{
		System.out.println("Education Detail of developer");
	}
	void workHistory()
	{
		System.out.println("Work History of developer");
	}
}
class tester extends employee
{
	void detail()
	{
		System.out.println("Detail of tester ");
	}
	void educationDetail()
	{
		System.out.println("Education Detail of tester");
	}
	void workHistory()
	{
		System.out.println("Work History of tester");
	}
}
class Network_Admin extends employee
{
	void detail()
	{
		System.out.println("Detail of Network Admin");
	}
	void educationDetail()
	{
		System.out.println("Education Detail of Network Admin");
	}
	void workHistory()
	{
		System.out.println("Work History of Network Admin");
	}
}
public class generalation_upcating 
{
	public static void main(String[] args) 
	{
		developer d1=new developer();
		tester t1=new tester();
		Network_Admin n1=new Network_Admin();
		/*employee e1=d1;
		d1.detail();
		d1.educationDetail();
		d1.workHistory();
		 */
		employee e1=t1;
		t1.detail();
		t1.educationDetail();
		t1.workHistory();
		/*
		employee e1=n1;
		n1.detail();
		n1.educationDetail();
		n1.workHistory();
		 */

	}
}
/*
 OUTPUT:-

A)employee e1=d1;
Detail of developer 
Education Detail of developer
Work History of developer
---------------------------------------------------------
B)employee e1=t1;
Detail of tester 
Education Detail of tester
Work History of tester
---------------------------------------------------------
C)employee e1=n1;
Detail of Network Admin
Education Detail of Network Admin 
Work History of Network Admin

 */

