package monali;

public class SwappingWithoutThirdVar {
	public static void main(String[] args) {
		int firstNo = Integer.parseInt(args[0]);
		int secondNo = Integer.parseInt(args[1]);

		firstNo = firstNo + secondNo;
		secondNo = firstNo - secondNo;
		firstNo = firstNo - secondNo;
		System.out.println("Swapping of two numbers without using third variable:" + "\nFirst Number after Swap: "
				+ firstNo + " and Second Number after swap: " + secondNo);
	}
}
