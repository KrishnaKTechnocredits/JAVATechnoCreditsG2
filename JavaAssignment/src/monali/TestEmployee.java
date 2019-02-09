package monali;

import java.util.Scanner;

public class TestEmployee {   //parent class of Employee class
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee details: employee id, name and salary");
		//call methods in employee class
		Employee e=new Employee(sc.nextInt(),sc.next(),sc.nextInt());
		e.employeedetails();
	}

}
