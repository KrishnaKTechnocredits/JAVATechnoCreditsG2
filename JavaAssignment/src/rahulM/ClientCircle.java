package constructor;

import java.util.Scanner;

public class ClientCircle {

	public static void main(String[] args) {
		Circle cir = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the circle:");
		float rad =sc.nextFloat();
		cir.area(rad);
		cir.circumference(rad);

	}

}
