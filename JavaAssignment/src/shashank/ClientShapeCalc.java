package shashank;

public class ClientShapeCalc //This is client class to use area and perimeter of rectangle and circle
{
	public static void main(String[] args) {
		Rectangle rect1= new Rectangle();
		rect1.displayCalc(Float.parseFloat(args[0]), Float.parseFloat(args[1])); //calling display method of Rectangle
		Circle cir1= new Circle();
		cir1.displayCalc(Float.parseFloat(args[2]));  //calling display method of Circle
	}
}
