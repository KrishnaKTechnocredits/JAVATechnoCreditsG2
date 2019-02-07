package arpita;

public class FahrenheitToCelsiusQ6 {
	public static void main(String[] args) 
	    {
		
		 FahrenheitToCelsiusQ6 a= new FahrenheitToCelsiusQ6();
		 System.out.println("Temperature in celsius is: "+ a.convert(64));
			
		}
		float convert(float f)
		{
			float celsius = (f-32)*5/9;
			return celsius;
		}


}
