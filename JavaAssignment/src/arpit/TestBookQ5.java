package arpit;

import java.util.Scanner;

public class TestBookQ5 {

	public static void main(String[] args) {

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Title of the book: ");

		// Take title of the book from user
		String title = sc.next();

		System.out.println("Enter name of the book publisher: ");

		// Take name of the publisher from user
		String publisher = sc.next();

		System.out.println("Enter name of the book author: ");

		// Take name of the book author from user
		String author = sc.next();

		// Creating object of the class and provide input to the constructor
		BookQ5 book = new BookQ5(title, publisher, author);

		// Call displayBookDetails method to show all the details of the book
		book.displayBookDetails();

	}

}
