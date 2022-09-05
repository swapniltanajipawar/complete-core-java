//Anonymous class outside main class
package Anonymous;
abstract class vehicle
{
	abstract void type();
}
class Bike
{
	vehicle v1=new vehicle()
	{
		void type()
		{
			System.out.println("vehicle type is Bike");
		}
	};
}
public class Test_vehicle
{    
	static vehicle v1=new vehicle()
	{   
		@Override
		void type()
		{
			System.out.println("vehicle type is 2 wheeler");
		}
	};
	public static void main(String [] args)
	{
		v1.type();
		Test_vehicle.v1.type();
		System.out.println("------------------------------------------");
		Bike b1=new Bike();
		b1.v1.type();
	}
}
