package Inheritance;
//super class
class cinepolis
{
	double ticketPrice=150.0;
	double totalAmount=0.0;

	void bookTicket( int seats)
	{
		System.out.println("Ticket Price is:"+ticketPrice);
		System.out.println("Seats selected:"+seats);
		totalAmount=ticketPrice*seats;
		System.out.println("Total amount to pay:"+totalAmount);

	}
}
class BookMyshow extends cinepolis
{
	double discount=100.0;
	void bookMovieTicket( int seats)
	{  
		System.out.println("Booking Movie ticket through BookMyShow App:");
		//calling super class method
		bookTicket(seats);
		System.out.println("Book movie discount:"+discount);
		totalAmount=totalAmount-discount;
		System.out.println("Total amount to pay:"+totalAmount);
	}
}
public class Test_Movie
{
	public static void main(String [] args)
	{
		cinepolis c1=new cinepolis();
		c1.bookTicket(3);
		System.out.println("----------------------------------------------------");
		BookMyshow b1=new BookMyshow();
		b1.bookMovieTicket(4);

	}
}