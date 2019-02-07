package swapnali;

public class Temperature_Conversion {
	
	public static void main(String[] args) {
		
		float Fahrenheit =Float.parseFloat(args[0]);
		
		Temperature_Conversion.Temperature(Fahrenheit);
		
	}

	static void Temperature(float Fahrenheit)
	{
		float celsius =(Fahrenheit - 32) * 5 / 9;
		System.out.println("The celsius is : "+celsius);
	}
}
