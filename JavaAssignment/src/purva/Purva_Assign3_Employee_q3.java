/* This is Employee Service class where constructor is defined and initialized */
/* Create Employee class and parameterized constructor with attributes empId , empName and salary. Write a method to display the details of employees. Create a TestEmployee class to test Employee class functionality. */

package purva;

public class Purva_Assign3_Employee_q3 {

	int id;
	String name;
	float sal;

	/* Parameterized constructor which initalises values while creating object */
	Purva_Assign3_Employee_q3(int empID, String empName, float salary) {
		id = empID;
		name = empName;
		sal = salary;
	}

	/* Method to display employee details entered by user */
	void displayDetails() {
		System.out.println("\n" + "Employee Details are as below: ");
		System.out.println("Employee ID: " + id);
		System.out.println("Employee name: " + name);
		System.out.println("Employee Salary: " + sal);
	}

}
