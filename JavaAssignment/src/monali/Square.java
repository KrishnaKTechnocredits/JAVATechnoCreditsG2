package monali;

public class Square {
	float squareside;
	
	Square(float side)
	{
		squareside=side;
	}

	void areaOfSquare(){
		
		float areaOfSquare=squareside*squareside;
		System.out.println("Area of Square is: "+areaOfSquare);
	}
}
