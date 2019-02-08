package array_1;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
	 UserInputArray x = new UserInputArray();
	 int num[]= x.takeUserInputArrayInt();
	 System.out.println("end");

	}
	int[] takeUserInputArrayInt()
	{
		System.out.println("Numbers to be taken as input: ");
		Scanner sc = new Scanner(System.in);
		int ipnumber=sc.nextInt();
		int userInputNum[]= new int [ipnumber];
		System.out.println("Enter the number: ");
		for(int index=0; index<userInputNum.length;index++)
		{
			userInputNum[index]=sc.nextInt();
		}
		sc.close();
		return userInputNum;
	}

}
