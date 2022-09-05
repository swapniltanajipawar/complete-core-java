//Interface and Anonymous class
package Interface;

interface Employee
{
	void details(int id, String name);
}

public class Test_Employee 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee()//Anonymous class->inner class inside Test_Employee
		{
			@Override
			public void details(int id, String name)
			{
				System.out.println("Employee id is:"+id); 
				System.out.println("Employee Name is:"+name); 
			}

		};
		
		e1.details(22,"Samba");
	}
}
