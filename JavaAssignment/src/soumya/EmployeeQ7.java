package soumya;

public class EmployeeQ7 {
	String empName, empName1;
	int deptId, deptId1;
	double salary, salary1;

	// Parameterized Constructor
	EmployeeQ7(String empName, int deptId, double salary) {
		this.empName = empName;
		this.deptId = deptId;
		this.salary = salary;
	}

	// Method for comparing salary
	void compareEmpSalary(EmployeeQ7 e1, EmployeeQ7 e2) {
		System.out.println(e1.salary);
		if (e1.salary > e2.salary) {
			System.out.println("Details of employee with highest salary: ");
			System.out.println("Employee Name: " + e1.empName);
			System.out.println("Department Id: " + e1.deptId);
			System.out.println("salary: " + "Rs." + e1.salary);
		} else if (e1.salary < e2.salary) {
			System.out.println("Details of employee with highest salary: ");
			System.out.println("Employee Name: " + e2.empName);
			System.out.println("Department Id: " + e2.deptId);
			System.out.println("salary: " + "Rs." + e2.salary);
		} else {
			System.out.println("Salary is same for both employees");
			System.out.println(e1.empName + " : Rs." + e1.salary);
			System.out.println(e2.empName + " : Rs." + e1.salary);
		}
	}
}
