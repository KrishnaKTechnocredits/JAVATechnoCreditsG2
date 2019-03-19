package technoCredits.accessmodifiers_array_2701;

//Outer class can not be declared as a private
// Private methods, variable can be used anywhere in your class.
public class AccessModifierDemo1 {

	// Instance variable can be declared as a private.
	static final private int x = 10;
	int y = 20;

	// Class method can be declared as a private
	private int m1() {
		// Local variable can not be declared as a private.
		// Local variable can be declared as final.
		final int z = x + y;
		System.out.println("X:   " + x + " Y: " + y);
//		x = x + y;
		System.out.println("x: " + x);
		return x;
	}

	public static void main(String[] args) {
		AccessModifierDemo1 am1 = new AccessModifierDemo1();
		am1.m1();
	}

	// Inner class can be a declared as a private.
	private class InnerClassDemo {

	}

}
