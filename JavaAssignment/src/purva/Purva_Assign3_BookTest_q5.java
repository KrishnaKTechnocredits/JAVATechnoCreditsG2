/* Create a class Book having Title, Book Publisher, Author with parameterized constructor using this
keyword. Write a method to display the details of the Book and Test the class by creating objects.

This is client class which test the Book class by creating object of service class */


package purva;

import java.util.*;

public class Purva_Assign3_BookTest_q5 {
	public static void main(String[] args) {

		char choice = 'y';
		do {
			System.out.println("\n" + "****Enter the details of the book****");
			System.out.println("Enter the Title of the book: ");
			Scanner sc1 = new Scanner(System.in);
			String titl = sc1.next();
			System.out.println("Enter the Publisher of the book: ");
			Scanner sc2 = new Scanner(System.in);
			String pub = sc2.next();
			System.out.println("Enter the Author of the book: ");
			Scanner sc3 = new Scanner(System.in);
			String aut = sc3.next();
			
			/* obj1 is created and parameters passed to constructor of Book class */
			Purva_Assign3_Book_q5 obj1 = new Purva_Assign3_Book_q5(titl, pub, aut);
			obj1.detailsBookDetails();
			System.out.println("\n" + "Do you want to continue. Enter y or n: ");
			Scanner sc4 = new Scanner(System.in);
			choice = sc4.next().charAt(0);
		} while ((choice == 'y') || (choice == 'Y'));
		System.out.println("Program ended!!");
	}
}
