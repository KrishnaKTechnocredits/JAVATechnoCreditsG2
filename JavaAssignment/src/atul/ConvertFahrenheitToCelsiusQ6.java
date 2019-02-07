//Write a Java program to convert temperature from Fahrenheit to Celsius degree.
package atul;

public class ConvertFahrenheitToCelsiusQ6 {

	double calculateConversion(double fahrenheit) {
		double celsius = (((fahrenheit - 32) * 5) / 9);
		return celsius;
	}

	public static void main(String[] args) {
		ConvertFahrenheitToCelsiusQ6 obj = new ConvertFahrenheitToCelsiusQ6();
		Double celsiusvalue = obj.calculateConversion(Double.parseDouble(args[0]));
		System.out.println(Double.parseDouble(args[0]) + " Degree Fahrenheit " + " is equal to " + celsiusvalue + " Degree Celsius");
	}
}
