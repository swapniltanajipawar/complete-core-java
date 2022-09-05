//4. Write a Java program to book a room in Hotel with various discount using multilevel inheritance.
package Inheritance;

class HotelHayat
{
	double Room1dayCharge=2500.0;
	double totalAmount=0.0;

	void bookRoomTicket( int room)
	{
		System.out.println("Room 1 day Charge Price is:"+Room1dayCharge);
		System.out.println("Room selected:"+room);
		totalAmount=Room1dayCharge*room;
		System.out.println("Total amount to pay:"+totalAmount);

	}
} 

class phonePay extends HotelHayat
{ 
	double discount=500.0;
	void bookTicket( int rooms)
	{  
		System.out.println("Booking room through phonepay App:");
		//calling super class method
		bookRoomTicket(rooms);
		System.out.println("Book room discount:"+discount);
		totalAmount=totalAmount-discount;
		System.out.println("Total amount to pay:"+totalAmount);
	}
}
class CreditCardofHdfc extends HotelHayat
{ 
	double discount=1000.0;
	void bookTicket( int rooms)
	{  
		System.out.println("Booking room through  Credit Card of Hdfc bank :");
		//calling super class method
		bookRoomTicket(rooms);
		System.out.println("Booking room discount:"+discount);
		totalAmount=totalAmount-discount;
		System.out.println("Total amount to pay:"+totalAmount);
	}
}
public class Test_BookRoom
{
	public static void main(String [] args)
	{
		CreditCardofHdfc c=new CreditCardofHdfc();
		c.bookTicket(2);
		System.out.println("----------------------------------------------------------------");
		phonePay p1=new phonePay();
		p1.bookTicket(3);
		System.out.println("----------------------------------------------------------------");
		System.out.println("Thank you for visiting Hayat");



	}
}