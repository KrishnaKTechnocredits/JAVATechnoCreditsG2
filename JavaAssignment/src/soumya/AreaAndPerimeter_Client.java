/*
 * This Program will find area and perimeter of circle and rectangle
 */

package soumya;

public class AreaAndPerimeter_Client {

	public static void main(String[] args) {
		AreaAndPerimeter_Service o1 = new AreaAndPerimeter_Service();
		o1.areaRect(10.5, 20.5);
		o1.perimeterRect(10, 20);
		o1.areaCircle(30);
		o1.perimeterCircle(30);

	}

}
