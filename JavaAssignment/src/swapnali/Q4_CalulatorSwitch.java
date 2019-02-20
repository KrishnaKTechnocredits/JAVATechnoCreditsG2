package swapnali;

import java.util.Scanner;

public class Q4_CalulatorSwitch {
static	int Operation ;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int FirstNumber = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int SecondNumber = sc.nextInt();

		System.out.println("Choose the operation you want to perform: ");
		Operation = sc.nextInt();
		 
		Q4_CalulatorSwitch calculator=new Q4_CalulatorSwitch();
		
		calculator.selectCalculatorOperation(FirstNumber, SecondNumber);
	}
	
	void selectCalculatorOperation(int FirstNumber,int SecondNumber) {
		
		switch (Operation) {
		case 1:
			System.out.println("Addition of two numbers is: " + (FirstNumber + SecondNumber));
			break;
		case 2:
			System.out.println("Substraction of two numbers is: " + (FirstNumber - SecondNumber));
			break;
		case 3:
			System.out.println("Multiplication of the two numbers is : " + (FirstNumber * SecondNumber));
		case 4:
			System.out.println("Division of two numbers is: " + (FirstNumber / SecondNumber));
			break;
		default:
			System.out.println("Invalid Operation");
		}

	}
}
