/*WAP to find number is Armstrong or not.
a. Int number = 153
i. Number is Armstrong
b. Int number = 234
i. Number is not Armstrong
Note :- Armstrong number means sum of each number cubes to number it self.*/

package purva;

public class Purva_q13_Service {

	// below method will first find out each digit of number, calculate its cube
	// and add it to sum. Likewise it will do this for other digits also and add
	// the answer to sum
	int cubeOfNum(int num) {
		int sum = 0, cube = 0, temp = 0;

		// calculate cube of each digit and add the answer to sum
		while (num > 0) {
			temp = num % 10;
			cube = temp * temp * temp;
			sum = sum + cube;
			num = num / 10;

		}
		return sum;
	}

	// checks if sum calculated in above code = num input by user
	void amstrongNumber(int num) {
		int sum = cubeOfNum(num);
		if (num == sum) {
			System.out.println("Number " + num + " is amstrong number");
		} else {
			System.out.println("Number " + num + " is not a amstrong number");
		}
	}

}
