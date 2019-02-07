package rashmi;

public class Temperature 
{
	static void temp(double fahrenheit)
    {
    	double celsius=(fahrenheit-32)*5/9;
    	System.out.println("Converted value of temperature is : "+celsius +" degrees");
    }
    
	public static void main(String[] args) 
    {
		double fahrenheit=Double.parseDouble(args[0]);
		temp(fahrenheit);
    }
}
