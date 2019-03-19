package swapnali;

public class Q5_Set2_BookDetails {

	String Title,Publisher,Author;
	
	public Q5_Set2_BookDetails(String Title,String Publisher,String Author)
	{
		this.Title=Title;
		this.Publisher=Publisher;
		this.Author=Author;
	}
	
	void displayBookDetails()
	{
		System.out.println("Book Name is: "+Title);
		System.out.println("Book Publisher Name is: "+Publisher);
		System.out.println("Book Author is: "+Author);
	}
}
