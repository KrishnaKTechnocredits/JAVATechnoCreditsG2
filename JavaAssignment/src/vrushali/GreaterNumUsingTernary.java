package vrushali;

import java.util.Scanner;

public class GreaterNumUsingTernary {
	
	int greaterNumCheck(){
				
		System.out.println("Enter 2 numbers to find greater one");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		 	
		int greaterNum= num1>num2 ? num1: num2;
		System.out.println("Greater number is: "+greaterNum);
		sc.close();
		return greaterNum;
		
	}
	
	public static void main(String[] args) {
		GreaterNumUsingTernary greaterNumIs = new GreaterNumUsingTernary();
		greaterNumIs.greaterNumCheck();
	}

}
