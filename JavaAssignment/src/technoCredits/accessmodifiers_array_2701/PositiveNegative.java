package technoCredits.accessmodifiers_array_2701;

import technoCredits.scannerDemo2601.InputOutputOperations;

public class PositiveNegative {

	int[] seperatePostiveNegativeSum(int[] input)
	{
		//System.out.println(input.length);
		int pCount =0;
		int nCount = 0;
		int pSum=0;
		int nSum = 0;
		int[] ans = new int[4];
		for(int i=0;i<input.length;i++)
		{
			System.out.println(input[i]);
			if(input[i] >0)
			{
				pCount++;
				pSum = pSum + input[i];
			}
			else
			{
				nCount++;
				nSum += input[i];
			}
		}
		
		ans[0] = pCount;
		ans[1] = pSum;
		ans[2] = nCount;
		ans[3] = nSum;
		//System.out.println("Postive number count " + pCount + " and sum is "+ pSum);
		//System.out.println("Negative number count " + nCount+ " and sum is "+ nSum);
		return ans;
	}
	
	public static void main(String[] args) {
		InputOutputOperations input = new InputOutputOperations();
		int[] num = input.takeInputFromUserInt();
		PositiveNegative positiveNegative = new PositiveNegative();
		int[] x = positiveNegative.seperatePostiveNegativeSum(num);
		
		System.out.println("Postive number count " + x[0] + " and sum is "+ x[1]);
		System.out.println("Negative number count " + x[2]+ " and sum is "+ x[3]);
				
	}
}
