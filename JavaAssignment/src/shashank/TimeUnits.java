package shashank;

public class TimeUnits 
{
	float secontToMinute(int second)
	{
		return (float)second/60;
	}
	
	float secondToHour(int second)
	{
		return (float)second/(60*60);
	}
	
	void displayTimeUnitConversion(int second)
	{
		System.out.println(second+" second/s is equivalent to "+secontToMinute(second)+" minute/s and "+secondToHour(second)+" hour/s.");
	}
	
	public static void main(String[] args) 
	{
		new TimeUnits().displayTimeUnitConversion(Integer.parseInt(args[0]));
	}
}
