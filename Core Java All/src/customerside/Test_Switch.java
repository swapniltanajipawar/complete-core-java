package customerside;
import serverside.CFL_Bulb;
import serverside.LED_Bulb;

public class Test_Switch 
{
	public static void main(String[] args) 
	{
		Switch s1= new LED_Bulb();
		s1.on();
		s1.off();
	}
}
