package technoCredits.switchDemo;

import java.util.Scanner;

public class UserInputOnContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		while(true)
		{
			if(cnt == 3)
				break;
			int marks = sc.nextInt();
			if(marks <0)
				continue;
			System.out.println("Marks " + marks);
			cnt++;
		}
	}
}
