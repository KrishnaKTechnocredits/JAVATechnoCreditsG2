package shashank;

//Program to find the missing number in integer array of 1 to 10. size of array in considered here as 10
public class MissingNumArray_Q1Jan27 
{
	static int MissingNumArr(int num[])
	{
		int actSum=0;
		int totalSum=10*(10+1)/2;
		for (int index=0; index<num.length; index++)
		{
			actSum=actSum+num[index];
		}
		return totalSum-actSum;
	}
	
	public static void main(String[] args) {
		System.out.println("The missing number between array of 1 to 10 numbers is : " +MissingNumArr(UserInputArrayConverter.takeInputFromUserInt()));
	}
}
