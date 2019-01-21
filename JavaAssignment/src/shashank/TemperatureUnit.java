package shashank;

public class TemperatureUnit 
{
	float tempUnitChange(float fahrenheit)
	{
		return (fahrenheit-32)*5/9;  //Here temperature is being converted into Celsius from Fahrenheit
	}
	
	public static void main(String[] args) 
	{
		System.out.println("The temperature in degree Celsius is \""+new TemperatureUnit().tempUnitChange(Float.parseFloat(args[0]))+"\" for "+
				Float.parseFloat(args[0])+" fahrenheit.");
	}
}
