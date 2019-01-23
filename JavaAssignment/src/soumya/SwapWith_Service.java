package soumya;

public class SwapWith_Service {
	int a = 25, b = 35;

	// Method for swapping two numbers
	void Swap() {
		System.out.println("Number Before Swap a=" + a);
		System.out.println("Number Before Swap b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Number After Swap a=" + a);
		System.out.println("Number After Swap b=" + b);
	}
}
