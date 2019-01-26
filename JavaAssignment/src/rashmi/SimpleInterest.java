package rashmi;

public class SimpleInterest 
{
    static void cal(double principal, double rate, int years )
    {
    	double si=(principal*rate*years)/100;
    	System.out.println("Calculated Simple Interest is : "+si);
    }
    
	public static void main(String[] args) 
    {
		double principal=Double.parseDouble(args[0]);
		double rate=Double.parseDouble(args[1]);
		int years=Integer.parseInt(args[3]);
		cal(principal,rate,years);
    }
}
