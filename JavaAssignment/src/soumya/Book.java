package soumya;

public class Book {
	String bookTitle, bookPublisher, bookAuthor;

	// Parameterized Constructor
	Book(String bookTitle, String bookPublisher, String bookAuthor) {
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.bookAuthor = bookAuthor;
	}

	// Method for displaying details
	void display() {
		System.out.println("Book Title: " + bookTitle);
		System.out.println("Book Publisher: " + bookPublisher);
		System.out.println("Book Author: " + bookAuthor);
	}
}
