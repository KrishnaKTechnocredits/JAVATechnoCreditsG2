package constructor;

import java.util.Scanner;

public class Bank {
	int account_no;
	String name;
	int amount;
	int balance=15000;
	Scanner sc = new Scanner(System.in);
	void insertData(){
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		account_no=sc.nextInt();
		if (account_no<0){
			System.out.println("Invalid Account details:!!!");
		}
		else{
		
		System.out.println("Enter AccountHolder Name:");
		String name= sc.next();
		}
	}
	void deposit(){
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be deposited in Rupees:");
		int amount= sc.nextInt();
		if(amount<=0){
			System.out.println("Invalid Amount!!!");
		}
		else{
			balance+=amount;
			System.out.println("Rupees: "+amount+ "is credited in your account "+"Your Current balance is :"+balance);
		}
	}
		void withdraw(){
			//Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount to be withdrawn in Rupees:");
			int amount= sc.nextInt();
			if (amount<=0||amount>balance){
				System.out.println("Invalid amount!!!");
			}
			else{
				balance-=amount;
				System.out.println("Rupees: "+amount + "  is debited in your account "+" Your Current balance is :"+balance);
			}
		}
		void checkbalance(){
			System.out.println("Your Current Balance is :"+balance);
		}
		void displayDetails(){
			System.out.println("Your Account Number is :"+account_no);
			System.out.println("Accountholder Name  is :"+name);
			System.out.println("Your Account current balace is :"+balance);
			
		}
		
	}	
			
				
	


