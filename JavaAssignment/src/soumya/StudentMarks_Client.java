/* 
 * This Program will calculate student marks
 */
package soumya;

public class StudentMarks_Client {
	public static void main(String[] args) {
		StudentMarks_Service mark = new StudentMarks_Service();
		mark.calculateMark();
	}
}
