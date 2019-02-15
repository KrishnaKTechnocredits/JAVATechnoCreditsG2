package soumya;

import java.util.Scanner;

public class CharFrequency_Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.next();
		System.out.println("Enter Character: ");
		char ch=sc.next().charAt(0);
		sc.close();
		CharFrequency_Service freq=new CharFrequency_Service();
		int count=freq.length(str,ch);
		System.out.println("Count of "+ch+":-"+count);
		

	}

}
