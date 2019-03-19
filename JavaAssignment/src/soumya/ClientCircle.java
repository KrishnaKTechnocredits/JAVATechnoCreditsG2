/*
 * This Program will find area and circumference of circle
 */
package soumya;

public class ClientCircle {
	public static void main(String[] args) {
		Circle circle = new Circle();
		float radius = circle.radius(4);
		circle.area(radius);
		circle.circumference(radius);
	}
}
