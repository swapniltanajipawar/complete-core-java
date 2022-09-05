//3. write a program to achieve downcasting using abstract class
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
	void developerworkdetail()
	{
		System.out.println("Work detail of developer ");
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
	void testingworkdetail()
	{
		System.out.println("work detail of tester ");
	}
}
class Network_Admin  extends employee
{
	void detail()
	{
		System.out.println("Detail of ");
	}
	void educationDetail()
	{
		System.out.println("Education Detail of Network_Admin ");
	}
	void workHistory()
	{
		System.out.println("Work History of Network Admin");
	}
	void NetworkAdminworkdetail()
	{
		System.out.println("work detail of Network Admin ");
	}
}
public class specialisation
{
	public static void main(String[] args) 
	{
		/*employee e1=new developer();//upcasting
		developer d1=(developer)e1;//downcating
		d1.detail();
		d1.educationDetail();
		d1.workHistory();
		d1.developerworkdetail();
		 */
		employee e1=new tester();//upcasting
		tester t1=(tester)e1;//downcating
		t1.detail();
		t1.educationDetail();
		t1.workHistory();
		t1.testingworkdetail();
		
		/*employee e1=new Network_Admin();//upcasting
		Network_Admin n1=(Network_Admin)e1;//downcating
		n1.detail();
		n1.educationDetail();
		n1.workHistory();
		n1.NetworkAdminworkdetail();
		*/
	}
}
/*
OUTPUT:

developer d1=(developer)e1;
Detail of developer 
Education Detail of developer
Work History of developer
work detail of developer 
------------------------------------------------------------
tester t1=(tester)e1;
Detail of tester 
Education Detail of tester
Work History of tester
work detail of 
-------------------------------------------------------------
Network_Admin n1=(Network_Admin)e1;
Detail of Network Admin 
Education Detail of Network Admin 
Work History of Network Admin
work detail of Network Admin 

 */
