package vrushali;

/* Question No 9
  WAP to find average of user given array
  a. Input :- {14, 32, 19, 14, 78,36}
  b. Output:- 32.16*/

public class AverageOfUserGivenArray {
	public static void main(String[] args) {
		int[] inputArr = { 14, 32, 19, 14, 78, 36 };
		AverageOfUserGivenArray averageSum = new AverageOfUserGivenArray();
		double ans = averageSum.average(inputArr);
		averageSum.display(ans);
	}

	// Method to calculate Sum
	int sum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	// Method to calculate Average of user given array
	double average(int[] inputArr) {
		double average = 0;
		double sumAns = sum(inputArr);
		average = sumAns / inputArr.length;

		return average;
	}

	// Method to display Average
	void display(double d) {
		System.out.println("Average is: " + d);
	}
}
