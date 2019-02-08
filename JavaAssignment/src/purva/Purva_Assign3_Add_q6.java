
/* Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String 
This is service class which has 3 methods Add with different parameters like int, string and double*/

package purva;

public class Purva_Assign3_Add_q6 {
	int c1;
	double c2;
	String c3;

	void Add(int a, int b) {

		int c1 = a + b;
		System.out.println("Addition of 2 integers = " + c1);
	}

	void Add(double a, double b) {
		double c2 = a + b;
		System.out.println("Addition of 2 float numbers = " + c2);
	}

	void Add(String a, String b) {
		String c3 = a + b;
		System.out.println("Addition of 2 string values = " + c3);
	}
}
