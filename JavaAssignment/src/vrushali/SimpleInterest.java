package vrushali;

public class SimpleInterest {
	double si;

	public static void main(String[] args) {
		float p = Float.parseFloat(args[0]);
		float t = Float.parseFloat(args[1]);
		float r = Float.parseFloat(args[2]);
		SimpleInterest si = new SimpleInterest();
		si.simpleIntrestCalc(p, t, r);
	}

	void simpleIntrestCalc(float p, float t, float r) {
		si = (p * t * r) / 100;
		System.out.println(
				"Simple interest on Principle amount " + p + " in time " + t + " year with rate " + r + " is: " + si);

	}

}
