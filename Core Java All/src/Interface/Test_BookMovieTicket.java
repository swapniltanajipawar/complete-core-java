//Lambda expression for the return type method:-

package Interface;

interface Movie
{
	double buyMovieTicket(int seats, double ticketPrice);//Functional interface
}

public class Test_BookMovieTicket
{
	public static void main(String[] args)
	{

		//Lambda expression
		Movie m1=(int seats, double ticketPrice)->
		{
			System.out.println("Seats selected:"+seats);
			System.out.println("Ticket price:"+ticketPrice);
			double totalAmount=seats*ticketPrice;
			return totalAmount;
		};

		double totalAmount=m1.buyMovieTicket(4, 100.0);
		System.out.println("Total Amount to pay:"+totalAmount);

		System.out.println("--------------------------------------------");
		//Lambda expression
		Movie m2=(int seats, double ticketPrice)->
		{
			return seats*ticketPrice;
		};

		double totalAmount1=m2.buyMovieTicket(5, 200.0);
		System.out.println("Total Amount to pay:"+totalAmount1);
	}
}