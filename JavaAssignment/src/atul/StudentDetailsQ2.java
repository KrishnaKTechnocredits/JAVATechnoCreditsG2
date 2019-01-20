//WAP to print the details of Student As Roll No, Name and Marks by taking input from the user
package atul;

public class StudentDetailsQ2 {

	// This function displays the details of the Student
	void displayDetails(int rollNo, String studentName, int marks) {
		System.out.println(
				studentName + " whose roll number is " + rollNo + " - scored " + marks + " out of 400 in examination");
	}

	public static void main(String[] args) {
		// creating the object of the class
		StudentDetailsQ2 obj1 = new StudentDetailsQ2();
		// calling the function to display the student details
		obj1.displayDetails(Integer.parseInt(args[0]), args[1], Integer.parseInt(args[2]));
	}
}
