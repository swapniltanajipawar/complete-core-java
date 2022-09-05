//Lambda expression for Argument type method
package Interface;
interface Bus
{
	void buyTicket(int seats, double ticketPrice);//functional interface->Single method only
}
public class Test_Bus
{
	public static void main(String[] args) 
	{
		//Lambda Expression
		Bus b1=(int seats, double ticketPrice)->{
			System.out.println("Seats selected:"+seats);
			System.out.println("Ticket Amount:"+ticketPrice);
			System.out.println("Total Amount:"+(seats*ticketPrice));
		};
		b1.buyTicket(2, 20);
		System.out.println("-----------------------------------------");
		//Lambda Expression
		Bus b2=(int seats, double ticketPrice)->System.out.println("Total Amount:"+(seats*ticketPrice));
		b1.buyTicket(4, 40);
	}
}
