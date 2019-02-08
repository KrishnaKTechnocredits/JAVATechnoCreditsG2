package shashank;

import java.util.Scanner;

// This class is called in client class CountOfTrees. UserInputArrayInt is created to prepare integer 
//array from user defined values
public class UserInputArrayInt 
{
	int[] takeUserInputArrayInt() 
	{
		System.out.println("Number of Integer values to be entered: ");
		Scanner scanner1 = new Scanner(System.in);
		int inputNum = scanner1.nextInt();
		int userInputNum[] = new int[inputNum];
		System.out.println("Please enter numbers");
		for (int index = 0; index < userInputNum.length; index++) 
		{
			userInputNum[index] = scanner1.nextInt();
		}
		scanner1.close();
		return userInputNum;
	}
	
	/*public static void main(String[] args) {
		UserInputArrayInt x=new UserInputArrayInt();
		int num[]=x.takeUserInputArrayInt();
		System.out.println(num[2]);
	}*/	
	
}

