package moverloading;

import java.util.Scanner;

public class BookDetails {
	String title;
	String bookPublisher;
	String author;	

	BookDetails(String title, String bookPublisher, String author) {

		this.title = title;
		this.bookPublisher = bookPublisher;
		this.author = author;
	}

	void displayDetails() {
		System.out.println(
				"Title of the book: " + title + " publisher:" + bookPublisher + " Name of the author: " + author);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the title of book: ");
		String title = scanner.next();
		System.out.println("Enter the name of book publisher: ");
		String bookPublisher = scanner.next();
		System.out.println("Enter the name of author: ");
		String author = scanner.next();

		BookDetails book = new BookDetails(title, bookPublisher, author);
		book.displayDetails();
	}

}

