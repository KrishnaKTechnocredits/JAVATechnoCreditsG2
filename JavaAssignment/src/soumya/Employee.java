package soumya;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;

	// Parameterized Constructor
	Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	// Method for displaying details
	void displayDetails() {
		System.out.println("Employee Id is: " + employeeId);
		System.out.println("Employee Name is: " + employeeName);
		System.out.println("Salary is: " + salary);
	}
}
