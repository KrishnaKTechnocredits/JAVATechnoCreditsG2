/*
 * This Program will display student details
 */
package soumya;

public class Student_Client {
	public static void main(String[] args) {
		Student_Service o1 = new Student_Service();
		o1.scannerInput();
		o1.details();
	}
}
