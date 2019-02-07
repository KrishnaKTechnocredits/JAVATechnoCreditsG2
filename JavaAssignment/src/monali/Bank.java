package monali;

import java.util.Scanner;

public class Bank {
	private int account_no;
	private String name;
	private int amount;
	int choice;
	
	Scanner sc=new Scanner(System.in);
	
	private void insertData()
	{
		System.out.println("Enter Account No: ");
		this.account_no=sc.nextInt();
		System.out.println("Enter Name: ");
		this.name=sc.next();
		System.out.println("Enter amount: ");
		this.amount=sc.nextInt();
	}
	
	private void deposit()
	{
		System.out.println("Enter amount to be deposit: ");
		int depositamt=sc.nextInt();
		depositamt=amount+depositamt;
		//System.out.println("Balance in account is : ");
	}
	private void withdraw()
	{
		System.out.println("Enter amount to withdraw: ");
		int withDrawAmt=sc.nextInt();
		withDrawAmt=amount-withDrawAmt;
		//System.out.println("Balance in account is: "+withDrawAmt);
	}
	private void checkBalance( )
	{
		System.out.println("Balance in Account is "+amount);
	}
	private void displayDetails()
	{
		System.out.println("Account details of customer is : "+account_no+","+name+","+amount);
	}
	
	void bankOperation()
	{
		 do{
			 	System.out.println("1. insertData"+"2. Deposit"+"3. Withdraw"+"4. Check Balance "+"5. Display Details");
				System.out.println("Enter action you want to perform : ");
				choice=sc.nextInt();
		 
		switch(choice)
		{
			case 1:
				insertData();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				checkBalance();
				break;
			case 5:
				displayDetails();
				break;
				default:
					System.out.println("Entered choice is not valid");
		}
		}while(choice>6);
	}
	
	
}
