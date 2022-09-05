/*2. Write a java program to show the difference between zero-argument constructor 
and argument constructor.*/

package Constructor;

class Notebook
{
	int pages;
	double price;


	Notebook()
	{
		System.out.println("running zero-argument");
		pages=100;
		price=22.5;
	}
	Notebook(int pages, double price)
	{
		System.out.println("running argument constructor");
		this.pages=pages;
		this.price=price;
	}
	void details()
	{
		System.out.println("Noteboook details:");
		System.out.println("Pages:"+pages);
		System.out.println("Price:"+price);

	}
}
public class Difference
{
	public static void main(String [] args)
	{
		Notebook n1=new Notebook();
		n1.details();
		System.out.println("-------------------------");
		Notebook n2=new Notebook(200,44.25);
		n2.details();
	}
}