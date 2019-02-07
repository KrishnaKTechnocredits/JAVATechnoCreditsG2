package purva;

class q5_SimpleInterest {
	public static void main(String[] args) {
		double principle = Double.parseDouble(args[0]);
		int year = Integer.parseInt(args[1]);
		float rate = Float.parseFloat(args[2]);

		System.out.println("Principle amount given by user= " + principle);
		System.out.println("Year given by user= " + year);
		System.out.println("Rate of Interest given by user= " + principle);

		q5_SimpleInterest.simpleInterest(principle, year, rate);
	}

	static void simpleInterest(double p, int y, float r) {
		double SI = (p * y * r) / 100;
		System.out.println("\n"+"Simple Interest = " + SI);
	}

}
