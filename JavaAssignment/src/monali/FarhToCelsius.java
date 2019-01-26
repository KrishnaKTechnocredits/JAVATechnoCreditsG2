package monali;

public class FarhToCelsius {

	public static void main(String[] args) {

		double farh = Double.parseDouble(args[0]);
		double Celsius = (farh - 32) * 5 / 9;
		System.out.println("Temperture is :" + farh + "\n It's Fahrenheit to Celsius degree:" + Celsius);
	}
}
