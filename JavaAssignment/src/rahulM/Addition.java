package moverloading;

import java.util.Scanner;

public class Addition {

	void add(int num1, int num2) {
		int sum= num1+num2;
		System.out.println("The sum of the given number: "+sum); 
	}

	void add(double num1, double num2) {
		double sum= num1 + num2;
		System.out.println("The sum of the given number: "+sum);
	}

	void add(String string1, String string2) {
		String sum= string1 + string2;
		System.out.println("The Concatenated of the given string is: "+sum);
	}

	public static void main(String[] args) {
		Addition add = new Addition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice from : Integer or Decimal or String ");
		String choice = sc.next();

		switch(choice){
		case "Integer":{
			System.out.println("Enter two numbers: ");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			add.add(num1, num2);
			break;
		}
		case "Decimal":{
			System.out.println("Enter two numbers: ");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			add.add(num1, num2);
			break;
		}
		case "String":{
			System.out.println("Enter two Strings: ");
			String string1=sc.next();
			String string2=sc.next();
			add.add(string1, string2);
			break;
		}
		default:
			System.out.println("Wrong choice");
			break;
			
		}
		sc.close();

	}

}

