package serverside;
import customerside.Switch;
public class LED_Bulb implements Switch
{
	@Override
	public void on()
	{
		System.out.println("LED Bulb turned ON");
	}
	@Override
	public void off()
	{
		System.out.println("LED Bulb turned OFF");
	}
}
