package monali;

public class SwapByThirdVar {
	public static void main(String[] args) {

		int firstNo = Integer.parseInt(args[0]);
		int secondNo = Integer.parseInt(args[1]);
		int Swap = firstNo;
		firstNo = secondNo;
		secondNo = Swap;
		System.out.println(
				"Swapping First Number: " + firstNo + " and Second number: " + secondNo + " using third variable");
	}
}
