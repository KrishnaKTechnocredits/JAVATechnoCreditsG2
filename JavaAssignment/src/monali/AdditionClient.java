package monali;

import java.util.Scanner;

public class AdditionClient {   // client class of addition
	public static void main(String[] args) {
		Addition objAddition = new Addition();
		objAddition.add(10, 25);
		objAddition.add(10.33, 95.22);
		objAddition.add("10", "25");

	}

}
