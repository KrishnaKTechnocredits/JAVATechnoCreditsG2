package monali;

public class Q1_Mona {

	void addition(int fn, int sn) {
		int Add = fn + sn;
		System.out.println("Adddition is:" + Add);
	}

	void substraction(int fn, int sn) {
		int sub = fn - sn;
		System.out.println("Subsctraction is:" + sub);
	}

	void multiplication(int fn, int sn) {
		int mul = fn * sn;
		System.out.println("Multiplication is: " + mul);
	}

	void division(int fn, int sn) {
		int div = fn / sn;
		System.out.println("Division is:" + div);
	}

	void modulo(int fn, int sn) {
		int mod = fn % sn;
		System.out.println("Modulo is:" + mod);
	}

	public static void main(String[] args) {
		Q1_Mona Q1 = new Q1_Mona();
		int fn = Integer.parseInt(args[0]);
		int sn = Integer.parseInt(args[1]);
		Q1.addition(fn, sn);
		Q1.substraction(fn, sn);
		Q1.multiplication(fn, sn);
		Q1.division(fn, sn);
		Q1.modulo(fn, sn);
	}
}
