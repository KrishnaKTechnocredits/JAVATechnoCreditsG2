package shashank;

import java.util.Scanner;

public class TestEmployee_Feb03 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter employee name, id and salary: ");
		Scanner sc = new Scanner(System.in);
		Employee_Feb03 emp1 = new Employee_Feb03(sc.next(),sc.nextInt(),sc.nextFloat());
		emp1.display();
	}
	
	
}
