//Find greater of two number using ternary operator
package switchcase;

import java.util.Scanner;

public class GreaterNum {

	public static void main(String[] args) {
		GreaterNum gNum =new GreaterNum();
		gNum.greaternumber();
	}
	void greaternumber(){
		int number1, number2,greaterNum;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number1: ");
		number1 = sc.nextInt();
		System.out.println("Enter Number2: ");
		number2=sc.nextInt();
		if(number1==number2){
			System.out.println("Both number are Equal");
		}
		else{
		greaterNum=(number1>number2)?number1:number2;
		System.out.println(greaterNum+ " is greater number");
		}
		sc.close();
	}
}
