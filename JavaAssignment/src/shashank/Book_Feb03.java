package shashank;

public class Book_Feb03 
{
	String bookTitle, bookPublisher, bookAuthor;
	Book_Feb03(String bookTitle, String bookPublisher, String bookAuthor)
	{
		this.bookTitle=bookTitle;
		this.bookPublisher=bookPublisher;
		this.bookAuthor=bookAuthor;
	}
	
	void displayBookDetails()
	{
		System.out.println("Book "+bookTitle+" is written by "+bookAuthor+" and is published by "+bookPublisher+" publisher!");
	}
}
