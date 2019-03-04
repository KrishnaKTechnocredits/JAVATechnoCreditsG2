/* Create a class Book having Title, Book Publisher, Author with parameterized constructor using this
keyword. Write a method to display the details of the Book and Test the class by creating objects.
This is service class which has parameterized constructor and published book details 
 */

package purva;

public class Purva_Assign3_Book_q5 {
	String Title, bookPublisher, Author;

	/* Parameterized constructor */
	Purva_Assign3_Book_q5(String Ttl, String bkpub, String auth) {
		this.Title = Ttl;
		this.bookPublisher = bkpub;
		this.Author = auth;
	}

	/*Book details method displays/ prints book details */
	void detailsBookDetails() {
		System.out.println("\n" + "Title of the book is: " + this.Title);
		System.out.println("Publisher of the book is: " + this.bookPublisher);
		System.out.println("Author of the book is: " + this.Author);
	}
}
