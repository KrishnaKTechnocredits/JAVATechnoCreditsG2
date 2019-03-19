package swapnali;

public class Q6_Set2_Addition {
	
	public static void main(String[] args) {
		Q6_Set2_Addition addition = new Q6_Set2_Addition();
		addition.add(10, 30);
		addition.add(10.20, 30.10);
		addition.add("Swapnali", "Technocredits");
	}
	
	void add(int num1, int num2) 
	{
		System.out.println("Addition of two integers is: " + (num1 + num2));
	}

	
	void add(double num1, double num2) 
	{
		System.out.println("Addition of two decimal is: " + (num1 + num2));
	}

	
	void add(String str1, String str2) 
	{
		System.out.println("Addition of two string is: " + (str1 + str2));
	}
}

