package Constructor;

abstract class vehicle extends Object
{
	String type;
	int wheels;
	vehicle(String type, int wheels)
	{
		System.out.println("running abstract class constructor");
		this.type=type;
		this.wheels=wheels;

	}
}
class car extends vehicle
{
	car()
	{
		super("XUV CAR", 6);
		System.out.println("running car class constructor");
	}
}
class Bike extends vehicle
{
	Bike(String biketype , int bikewheels )
	{
		super(biketype , bikewheels);
		System.out.println("running  bike class constructor");
	}
}

public class Difference1
{
	public static void main(String [] args)
	{
		car c1=new car();
		Bike b1=new Bike("Super bike", 2);
	}
}