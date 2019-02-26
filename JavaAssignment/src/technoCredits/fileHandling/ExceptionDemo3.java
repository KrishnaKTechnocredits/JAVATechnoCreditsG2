package technoCredits.fileHandling;

import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		ExceptionDemo3 ed3 = new ExceptionDemo3();
		// Invalid scenario
		/*
		 * try{ while(true){ System.out.print("Enter integer value: "); Scanner
		 * sc = new Scanner(System.in); int x = sc.nextInt();
		 * System.out.println("X is: "+x); } } catch(Exception e){
		 * System.out.println("In catch block"); }
		 */
		// Valid Scenario
		int x = 0;
		int count =1;
		while (count<=5) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter integer value: ");
			try {
				x = sc.nextInt();
				break;
			} catch (Exception e) {
				count++;
				System.out.println("Please try again !!   count: "+count);
			}
			//break;  //invalid break
		}
		System.out.println("X is: " + x);
	}

}
