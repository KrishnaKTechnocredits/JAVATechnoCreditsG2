package soumya;

public class SwapWithout_Service {
	int a = 25, b = 35, c;

	// Method for swapping two numbers
	void Swap() {
		System.out.println("Number Before Swap a=" + a);
		System.out.println("Number Before Swap b=" + b);
		c = a;
		a = b;
		b = c;
		System.out.println("Number After Swap a=" + a);
		System.out.println("Number After Swap b=" + b);
	}
}
