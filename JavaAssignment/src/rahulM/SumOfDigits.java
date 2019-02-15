//Q4

package array_string_programs;
import java.util.Scanner;
public class SumOfDigits {


		void sumOfNumber(int num) {
			int sum = 0;
			
			while (num > 0) {
				sum = sum + (num % 10);
				num = num / 10;
				
			}
			System.out.println("Sum of digits of given numbers is: " + sum);

		}

		public static void main(String[] args) {
			System.out.println("Enter the number");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			SumOfDigits snum = new SumOfDigits();
			snum.sumOfNumber(num);
			sc.close();
		}

	}


