//Find largest of three numbers using logical And operator
package switchcase;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		 LargestNum lrgNum = new LargestNum();
		 lrgNum.largestNumber();
		
	}
	void largestNumber(){
		int x, y, z;
	      System.out.println("Enter three integers ");
	      Scanner sc = new Scanner(System.in);
	 
	      x = sc.nextInt();
	      y = sc.nextInt();
	      z = sc.nextInt();
	 
	      if ( x > y && x > z )
	         System.out.println(x+"  is largest");
	      else if ( y > x && y > z )
	         System.out.println(y+" is largest.");
	      else if ( z > x && z > y )
	         System.out.println(z+" is largest.");
	      else   
	         System.out.println("Entered numbers are not distinct.");
	      sc.close();
	}

}
