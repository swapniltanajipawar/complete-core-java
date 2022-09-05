package serverside;
import customerside.Switch;
public class CFL_Bulb implements Switch
{
	@Override
	public void on()
	{
		System.out.println("CFL Bulb turned ON");
	}
	@Override
	public void off()
	{
		System.out.println("CFL Bulb turned OFF");
	}
}
