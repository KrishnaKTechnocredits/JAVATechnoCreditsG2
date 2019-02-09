package monali;

public class Book {
	String title;
	String bookPublisher;
	String author;

	Book(String t1, String bpublisher, String authr) {
		this.title = t1;
		this.bookPublisher = bpublisher;
		this.author = authr;
	}

	void displayBookDetails() {
		System.out.println("Details of book are: " + "Title of book is " + title + "  Book Publisher: " + bookPublisher
				+ " Author:  " + author);
	}

}
