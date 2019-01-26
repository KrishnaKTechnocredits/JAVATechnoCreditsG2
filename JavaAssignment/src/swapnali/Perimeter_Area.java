package swapnali;

public class Perimeter_Area {
	
	public static void main(String[] args) {
		
		Perimeter_Area pa = new Perimeter_Area();
		int length= Integer.parseInt(args[0]);
		int width= Integer.parseInt(args[1]);
		int radius= Integer.parseInt(args[2]);
		
		pa.Rectangle(length, width);
		pa.circle(radius);
	}

	void Rectangle(int length,int width)
	{
		int Result = 2 * length + 2 * width;
		System.out.println("The perimiter of rectangle: " +Result);
		
		Result =length * width ;		
		System.out.println("The area of rectangle: "+Result);
	}
	
	void circle(int radius)
	{
		float pi=3.14f;
		float Result = 2 * pi * radius;
		System.out.println("The perimiter of circle: " +Result);
		
		Result =pi * (radius * radius) ;		
		System.out.println("The area of circle: "+Result);
	}
	
}
