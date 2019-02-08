package arpit;

public class CheckArrayContainNumberQ3 {

	// This function perform the operation to check array contain number or not
	// and return value.
	int checkArrayContain(int[] num, int userNum) {

		int numfound = 0;
		int number = userNum;
		for (int index = 0; index < num.length; index++) {
			if (num[index] == number) {
				numfound = num[index];

			}

		}
		return numfound;
	}

	public static void main(String[] args) {

		// Creating the object of the InputOutputOperation class
		InputOutputOperations iop = new InputOutputOperations();

		// Take the input from user in array form
		int[] num = iop.takeInputFromUser();

		// Take the input from user in integer form
		int userNum = iop.takeIntegerInputFromUser();

		// creating the object of the class
		CheckArrayContainNumberQ3 checkArray = new CheckArrayContainNumberQ3();

		// To call the checkArrayContain method and provide input to that method
		// and store result in integral variable.
		int a = checkArray.checkArrayContain(num, userNum);

		// Display the result
		if (a == userNum) {
			System.out.println("Number given by the user: " + a + " is in Araay");
		} else if (a != userNum) {
			System.out.println("Number given by the user is not in Araay");
		}
	}

}
