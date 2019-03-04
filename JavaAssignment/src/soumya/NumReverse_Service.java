package soumya;

public class NumReverse_Service {
	// Method to reverse number
	int numRev(int num) {
		int temp = 0;
		while (num > 0) {
			temp = num % 10;
			num = num / 10;
			System.out.print(temp);
		}
		return temp;
	}
}
