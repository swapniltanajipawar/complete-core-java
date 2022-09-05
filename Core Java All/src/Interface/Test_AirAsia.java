//5.WRITE A PROGRAM TO BOOK A TICKET THROUGH MAKEMYTRIP WITH DISCOUNT AMOUNT.
//WHERE INTERFACE SHOULD BE AIR-ASIA
package Interface;
interface AirAsia
{
	void bookTripTicket( int seats, double ticketPrice, double discount, String bookNo, String name1 ,String name2);
}
class MakeMyTrip
{
	public void bookTripTicket( int seats, double ticketPrice, double discount, String bookNo, String name1 ,String name2,String date)
	{
		double amount=(seats*ticketPrice)-discount;
		System.out.println("***************************BOOKING CONFIRMATION*****************************");
		System.out.println("BOOKING NUMBER:"+bookNo+"                      BOOKING DATE:FRI 1 DEC 2020");
		System.out.println("GUEST DETAIL:");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("NAME");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("FLIGHT INFORMATION:");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("DATE               FLIGHT           DEPART             ARRIVE           ");
		System.out.println(date+"     FD 3270          PUNE    07.50      NEWYORK  06.45   ");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("INFLIGHT SERVICES:");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("GUEST                               SEATS      ");
		System.out.println(name1+"                    1A");
		System.out.println(name2+"                 1B");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("PAYMENT DETAILS:");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("TOTAL SEATS SELECTED:"+seats);
		System.out.println("TICKET PRICE:"+ticketPrice);
		System.out.println("TOTAL DISCOUNT ON TRIP BILL:"+discount);
		System.out.println("TOTAL AMOUNT TO PAY:"+amount);
		System.out.println("***********AMOUNT PAID SUCCESSFULLY THROUGH MAKEMYTRIP TRIP************");
		System.out.println("-----------------------------------------------------------------------");
	}
}
public class Test_AirAsia
{
	public static void main(String[] args)
	{
		System.out.println("                            WELCOME IN AIR-ASIA                            ");
		MakeMyTrip m1=new MakeMyTrip();
		m1.bookTripTicket(2,75000.0,10000.0,"HEYD5R","MR.SWAPNIL PAWAR","MR.ANSHUL CHATERJEE","MON 1 JAN 2021");
		System.out.println("                   THANK YOU TRAVEL AGAIN THOUGH AIR-ASIA                          ");
	}
}
