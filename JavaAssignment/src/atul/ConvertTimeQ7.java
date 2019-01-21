//Write a Java program to convert seconds to hour, minute and seconds
package atul;

public class ConvertTimeQ7 {

	// This function performs the conversion and displays the result
	void performConversion(int seconds) {
		// calculate seconds
		int p1 = seconds % 60;
		// calculate hours
		int p2 = seconds / 60;
		p2 = p2 / 60;
		// calculate minutes
		int p3 = p2 % 60;
		// display the converted time
		System.out.println("Converted Time: " + p2 + " hours " + p3 + " minutes & " + p1 + " seconds");
	}

	public static void main(String[] args) {
		// creating the object
		ConvertTimeQ7 obj = new ConvertTimeQ7();
		// displaying the user provided argument
		System.out.println("User provided argument is " + Integer.parseInt(args[0]) + " seconds");
		// calling the function performing the conversion
		obj.performConversion(Integer.parseInt(args[0]));
	}
}
