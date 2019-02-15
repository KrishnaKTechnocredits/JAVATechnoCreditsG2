package vrushali;

/**
 * Question No. 4 to find sum of user given number Input:- 159753 Sum of given
 * number:- 30
 */
public class SumOfGivenNumber {
	public static void main(String[] args) {
		int num = 159753;
		SumOfGivenNumber numSum = new SumOfGivenNumber();
		int ans = numSum.sumCalculate(num);
		numSum.display(ans);
	}

	// Method to calculate sum of user given number
	int sumCalculate(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		return sum;
	}

	// Method to display sum of user given number
	void display(int sum1) {
		System.out.println(sum1);
	}
}
