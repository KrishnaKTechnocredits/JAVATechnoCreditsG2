//Write a Java program to compute simple interest
package atul;

public class CalculateSimpleInterestQ5 {

	// This function returns the calculated simple interest
	double computeSimpleInterest(int amt, int year, int rate) {
		return ((amt * year * rate) / 100);
	}

	public static void main(String[] args) {
		// creating the object
		CalculateSimpleInterestQ5 obj = new CalculateSimpleInterestQ5();
		// calling the function to calculate the SimpleInterest
		Double si = obj.computeSimpleInterest(Integer.parseInt(args[0]), Integer.parseInt(args[1]),
				Integer.parseInt(args[2]));
		// displaying the user entered amount
		System.out.println("Amount : " + Integer.parseInt(args[0]));
		// displaying the user entered years
		System.out.println("Time(in years) : " + Integer.parseInt(args[1]));
		// displaying the user entered amount
		System.out.println("Rate(in percentage) : " + Integer.parseInt(args[2]));
		// displaying the calculated Simple Interest
		System.out.println("Simple Interest Calculated : " + si);
	}
}
