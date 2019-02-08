package shashank;

import java.util.Scanner;

public class TestBook_Feb03 
{
	public static void main(String[] args) {
		System.out.println("Please enter book title, publisher and author");
		Scanner sc= new Scanner(System.in);
		Book_Feb03 b1 = new Book_Feb03(sc.next(), sc.next(), sc.next());
		b1.displayBookDetails();
	}
}

