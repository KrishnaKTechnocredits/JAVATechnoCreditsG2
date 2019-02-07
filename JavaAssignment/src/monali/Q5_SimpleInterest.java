package monali;

public class Q5_SimpleInterest {

	public static void main(String[] args) {
		double p = Double.parseDouble(args[0]);
		int t = Integer.parseInt(args[1]);
		double r = Double.parseDouble(args[2]);
		if (t <= 12) {
			double simpleInterest = (p * t * r) / 100;
			System.out.println("Simple Interest is: " + simpleInterest);
		} else
			System.out.println("Given time is not in a valid year range");
	}
}
