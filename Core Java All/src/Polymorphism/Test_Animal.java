//6.Write a program for Run time Polymorphism using interface

package Polymorphism;
 interface Animal
{
	 void eat();
	 void sleep();
}
class Elephant implements Animal 
{
	public void eat()
	{
		System.out.println("Elephant is Eating");
	}
	public void sleep()
	{
		System.out.println("Elephant is Sleeping");
	}
}
class Horse implements Animal 
{
	public void eat()
	{
		System.out.println("Horse is Eating");
	}
	public void sleep()
	{
		System.out.println("Horse is Sleeping");
	}
}
public class Test_Animal
{
	public static void main(String[] args) 
	{
		Elephant e1=new Elephant();
		e1.eat();
		e1.sleep();
		Horse h1=new Horse();
		h1.eat();
		h1.sleep();	
	}
}
