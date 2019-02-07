package rashmi;

public class Square 
{
	int side,area;
	Square()
	{
		
	}
    Square(int side)
    {
    	System.out.println("Parameterised Constructor  " +side);
    	this.side=side;
    }
    void calArea()
    {
    	area=side*side;
    	System.out.println("Area of Square is  " +area);
    }
}
