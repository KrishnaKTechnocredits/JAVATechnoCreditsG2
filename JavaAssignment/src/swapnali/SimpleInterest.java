package swapnali;

public class SimpleInterest {

	public static void main(String[] args) {
		
		float p=Float.parseFloat(args[0]);
		float t=Float.parseFloat(args[1]);
		float r=Float.parseFloat(args[2]);
		SimpleInterest.calInterest(p, t, r);
	}
		
	static void calInterest(float principle,float time,float rate)
	{
		float Interest=(principle * time * rate)/100;
		
		System.out.println("The simple interest calculated is: "+Interest);
	}
}
