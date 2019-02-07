package arpita;

public class TimeConvertQ7 {
	public static void main(String[] args) {
		
		TimeConvertQ7 s= new TimeConvertQ7();
		for(int i=0;i<args.length;i++)
		{
			s.convert(Float.parseFloat(args[i]));
		}
		
	}
	void convert(float second)
	{
		float h=second/3600;
		System.out.println("Hour is: " + h +"hour");
		float m=second/60;
		System.out.println("Minute is: " + m +"minute");
	}

}
