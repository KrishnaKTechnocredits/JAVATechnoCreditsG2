package vrushali;

public class FahrenheitToCelsius {
	double fahrenheit, celsius;

	public static void main(String[] args) {
		double fahrenheit = Double.parseDouble(args[0]);

		FahrenheitToCelsius f = new FahrenheitToCelsius();
		f.FahrenheitToCelsiusCal(fahrenheit);
	}

	void FahrenheitToCelsiusCal(double fahrenheit) {
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperture in Celsius degree is: " + celsius);
	}
}
