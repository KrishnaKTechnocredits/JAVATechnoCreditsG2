package shashank;

public class Indices 
{
	float squareIndex(float num)
	{
		return (num*num);
	}
	
	float cubeIndex(float num)
	{
		return (num*num*num);
	}
	
	void displayIndex(float num)
	{
		System.out.println("Square of the number "+num+" is : "+ new Indices().squareIndex(num));
		System.out.println("Cube of the number "+num+" is : "+ new Indices().cubeIndex(num));
	}
	
	public static void main(String[] args) 
	{
		Indices i=new Indices();
		i.displayIndex(Float.parseFloat(args[0]));
	}
}
