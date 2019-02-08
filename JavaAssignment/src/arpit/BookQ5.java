package arpit;

public class BookQ5 {

	String title;
	String publisher;
	String author;

	// This Constructor take input from user and update all variable value
	BookQ5(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}

	// This function is use to show all details of the book.
	void displayBookDetails() {
		System.out.println("Title of the book is: " + title);
		System.out.println("Book publish by the: " + publisher + " publisher ");
		System.out.println("Author of the book is: " + author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
