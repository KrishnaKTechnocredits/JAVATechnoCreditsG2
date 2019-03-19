package shashank;

import java.util.Scanner;

public class BankTransaction_Feb03 
{
	long acc_no;
	String name;
	float amount;
	void insertData()
	{
		System.out.println("Please enter account number, name and amount. Enter amount as 0 if no deposite or wothdrawal is to be done.");
		Scanner sc = new Scanner(System.in);
		this.acc_no=sc.nextLong();
		this.name=sc.next();
		this.amount=sc.nextFloat();
	}
	
	void deposite(BankTransaction_Feb03 bt1)
	{
		bt1.insertData();
		System.out.println(amount+" is deposited in your account!");
	}
	
	void withdraw(BankTransaction_Feb03 bt1)
	{
		bt1.insertData();
		System.out.println(amount+" is withdrawn for your account!");
	}
	
	void checkBalance(BankTransaction_Feb03 bt1)
	{
		bt1.insertData();
		System.out.println("Your current balance is xxxxxx rupees!");
	}
	
	void displayDetails(BankTransaction_Feb03 bt1)
	{
		bt1.insertData();
		System.out.println("Your account number with bank bbbbbb is "+acc_no+" and current balance is xxxxxx rupees!");
	}
	
	
}
