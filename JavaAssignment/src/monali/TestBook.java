package monali;

import java.util.Scanner;

public class TestBook {   /// Book class functionality to test
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Details such as title book publisher and author");
		String title = sc.next();
		String book_publisher = sc.next();
		String author = sc.next();
		Book b = new Book(title, book_publisher, author);
		b.displayBookDetails();
	}

}
