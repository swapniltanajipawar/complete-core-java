//4. Write a program to book a ticket through MakeMyTrip class with discount amount.
//Where abstract class (Super class) should be AirAsia.
package Abstract;
abstract class AirAsia
{
	abstract void bookTicket(int seats, double discount);
}
class MakemyTrip extends AirAsia
{
	void bookTicket(int seats, double discount)
	{
		double ticketPrice=5000.0;
		double totalAmount=(ticketPrice*seats)-discount;
		System.out.println("Ticket price:"+ticketPrice);
		System.out.println("Total number of Seats selected:"+seats);
		System.out.println("Discount from MakeMyTrip:"+discount);
		System.out.println("Total Amount to pay is:"+totalAmount);
		System.out.println("Thank you to Booking with MakemyTrip..Visit Again");


	}
}
public class BookmyTrip
{
	public static void main(String[] args)
	{
      MakemyTrip m1=new MakemyTrip();
      m1.bookTicket(3, 3000.0);
	}
}
