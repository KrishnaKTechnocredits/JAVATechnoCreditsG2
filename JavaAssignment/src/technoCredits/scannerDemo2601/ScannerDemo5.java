package technoCredits.scannerDemo2601;

import java.util.Scanner;

public class ScannerDemo5 {

	static String[] takeInputsFromUser()
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] name = new String[size];
		
		for(int i=0;i<name.length;i++){
			name[i] = sc.next();
		}
		return name;
	}
	
	static void display(String[] n)
	{
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter names");
		String[] name = takeInputsFromUser();
		display(name);
	}
}
