package rashmi;

import java.util.Scanner;

public class BankClient {

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 String name=sc.next();
		 int accNum=sc.nextInt();
		 float amount=sc.nextFloat();
		 int choice=sc.nextInt();
		 
		 Bank obj = new Bank();
		 switch(choice)
		 {
			case 1: obj.insertData(name,accNum,amount);
			    break;
			case 2: obj.deposit(amount);
			    break;
			case 3: obj.withdraw(amount);
			    break;
			case 4: obj.checkBalance(amount);
			    break;
			case 5: obj.displayDetails(name,accNum,amount);
		        break;
			default:
				break;
		}		
	}
}
