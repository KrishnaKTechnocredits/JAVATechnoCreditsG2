package shashank;

public class SimpleInterestCalc 
{
	float simpleInterestCalculation(int principle, float duration, float rate) //duration is duration in year
	{
		return principle*duration*rate/100;  //Simple interest will be returned
	}
	
	public static void main(String[] args) 
	{
		System.out.println("The simple interest for the amount of "+Integer.parseInt(args[0])+" for "+Float.parseFloat(args[1])
		+" years, at the rate of "+ Float.parseFloat(args[2])+" is "+ new SimpleInterestCalc().simpleInterestCalculation
		(Integer.parseInt(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2])));
	}
}
