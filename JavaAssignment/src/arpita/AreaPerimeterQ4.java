package arpita;

public class AreaPerimeterQ4 {
	public static void main(String[] args) {
		AreaPerimeterQ4 a = new AreaPerimeterQ4();
		a.rectangle(10,20);
		a.circle(12);
	}
	void rectangle(int length, int breadth)
	{
		int Rectarea = length * breadth;
		int Rectperimeter = 2*(length +  breadth);
		System.out.println("Rectangle area is: "+ Rectarea + " Rectangle perimeter is: "+ Rectperimeter);
	}
	void circle(int radius)
	{
		double cirarea= (3.142)*(radius*radius);
		double cirperimeter = 2*(3.142)*radius;
		System.out.println("circle area is: "+ cirarea + " circle perimeter is: "+ cirperimeter);
	}


}
