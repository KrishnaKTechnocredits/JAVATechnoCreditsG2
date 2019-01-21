/* 
 * This Program finds square root and cube root of any number
 */
package soumya;

public class Sqrtandcube_Client {
	public static void main(String[] args) {
		Sqrtandcube_Service o1 = new Sqrtandcube_Service();
		o1.scannerInput();
		o1.sqrt();
		o1.cube();
	}
}
