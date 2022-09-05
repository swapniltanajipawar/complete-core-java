//3. Write a Java program to initialise data members through argument constructor.
package Constructor;

class Notebook
{

	int pages;
	double price;

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
public class initialisation
{
	public static void main(String [] args)
	{
		Notebook n1=new Notebook(200,44.25);
		n1.details();
	}
}