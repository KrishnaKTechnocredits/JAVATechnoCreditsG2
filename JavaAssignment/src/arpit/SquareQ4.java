package arpit;

public class SquareQ4 {

	int side;
	int area = 0;

	// This constructor take side value of square from user and set this value
	// in instance variable
	SquareQ4(int side) {
		this.side = side;
	}

	// This function is use to perform to calculate area of the square and
	// return result
	int areaOfSquare() {
		area = side * side;
		return area;

	}

	// This function display area of the square
	void display() {
		System.out.println("Area of square whose side is " + side + " is: " + area);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
