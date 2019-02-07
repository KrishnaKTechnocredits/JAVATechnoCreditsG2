package rashmi;

import java.util.Scanner;

public class Book 
{
	Book()
	{
		
	}
    Book(String title, String publisher, String author)
    {
    	System.out.println("Parameterised Constructor");
    }
    void display(String title, String publisher, String author)
    {
    	System.out.println("Book title is  " +title +" Book publisher is " +publisher +" Book author is " +author);
    }
    public static void main(String[] args) 
	{
    	Scanner sc=new Scanner(System.in);
    	String title=sc.next();
	    String publisher=sc.next();
	    String author=sc.next();
	    Book obj = new Book(title, publisher, author);
	    obj.display(title, publisher, author);
	}
}
