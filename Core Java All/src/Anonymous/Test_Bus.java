// 6. write a java program to declare Abstract class with Anonymous class implementation 

package Anonymous;
abstract class Bus //Abstract class
{
	double ticketPrice=200.0;
	abstract void travel();//Incomplete method
}
public class Test_Bus
{
	public static void main(String [] args)
	{
		Bus b1=new Bus()
	   //Anonymous class (this class act as inner class for Test_Demo1 class)
				{
			double distance=100.0;    //global variable
			@Override
			void travel()
			{
				System.out.println("Bus started travelling.............");
				System.out.println("Distance is:"+distance+"Kms");
				stop();
			}
			void stop()
			{
				System.out.println("Bus stopped...........");
			}

				};

				System.out.println("b1:"+b1);
				System.out.println("Bus ticket:"+b1.ticketPrice);
				b1.travel();
				// b1.stop();-------------->error

	}
}
/*
 OUTPUT:
 
b1:Anonymous.Test_Bus$1@28a418fc
Bus ticket:200.0
Bus started travelling.............
Distance is:100.0Kms
Bus stopped...........

*/