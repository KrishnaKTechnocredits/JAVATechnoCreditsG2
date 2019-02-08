package shashank;

import java.util.Scanner;

public class BankTransactionClient_Feb03 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter if you wish to 1.deposite 2.withdraw 3.check balance 4.know details");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		BankTransaction_Feb03 btc=new BankTransaction_Feb03();
		switch(choice)
		{
		case 1:
			btc.deposite(btc);
			break;
		case 2:
			btc.withdraw(btc);
			break;
		case 3: 
			btc.checkBalance(btc);
			break;
		case 4:
			btc.displayDetails(btc);
			break;
		default:
			System.out.println("Wrong input!");
		}
	}
}
