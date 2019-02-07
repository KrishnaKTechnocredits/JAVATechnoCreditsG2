package arpita;

public class SimpleInterestQ5 {
	public static void main(String[] args) {
		new SimpleInterestQ5().simple(555,10,3);
		
	}
	void simple(float p, int r, int t)
	{
		float SI= (p*r*t)/100;
		System.out.println("Simple Interest is: "+ SI);
	}

}
