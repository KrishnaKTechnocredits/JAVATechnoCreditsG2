package swapnali;
import java.util.Scanner;

public class Q2_greatestNumber {

	
		int CalgretestNumber(int num1, int num2)
		{
			return (num1>num2 ? num1 : num2);
		}
		
		public static void main(String[] args) 
		{
			System.out.println("Please enter the numbers: ");
			Scanner sc=new Scanner(System.in);
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			Q2_greatestNumber number= new Q2_greatestNumber();
			if (num1==num2)
				System.out.println("Two numbers are equal");
			else
				System.out.println("The greatest number is : "+ number.CalgretestNumber(num1, num2));
		}

}


