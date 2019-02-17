package technoCredits.scannerDemo2601;

public class FindMaxNumber {

	int findMaxnum(int[] num)
	{
		int max = 0;
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i])
				max = num[i];
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		InputOutputOperations iop = new InputOutputOperations();
		int[] num= iop.takeInputFromUserInt();
		FindMaxNumber fmn =  new FindMaxNumber();
		int ans = fmn.findMaxnum(num);
		System.out.println(ans);
	}
}
