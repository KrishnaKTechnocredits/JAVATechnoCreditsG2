package constructor;

import java.util.Scanner;

public class BankClient {

	public static void main(String[] args) {
		Bank bnk = new Bank();
		System.out.println("Enter your choice:");
		System.out.println("1-deposit");
		System.out.println("2-witdrawal");
		System.out.println("3-Checkbalace");
		System.out.println("4-Display customer details");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		bnk.insertData();
		if(bnk.account_no>0){
			switch(choice){
			case 1:
				bnk.deposit();
				break;
			case 2:
				bnk.withdraw();
				break;
			case 3:
				bnk.checkbalance();;
				break;
			case 4:
				bnk.displayDetails();;
				break;
				default:
					System.out.println("Invaid Choice!!!Please select between 1 to 4");
			}
		}
	}

}
