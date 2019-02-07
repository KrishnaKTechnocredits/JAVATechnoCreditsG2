package purva;

import java.util.Scanner;

public class PurvaAssign3_JDM_q7_Area {
	public static void main(String[] args) {
		do
		{	
			PurvaAssign3_JDM_q7_AreaService o1 = new PurvaAssign3_JDM_q7_AreaService();
			System.out.println("\n"+"Menu");
			System.out.println("1. Area of Rectangle");
			System.out.println("2. Area of Triangle");
			System.out.println("3. Area of Circle");
			System.out.println("4. End the program");
			System.out.println("\n"+"Enter option 1-4 from above menu");
			Scanner sc = new Scanner(System.in);
			int option=sc.nextInt();
			
			switch(option)
			{
			case 1:
				o1.areaRectangle();
				break;
			case 2:
				o1.areaTriangle();
				break;
			case 3:
				o1.areaCircle();
				break;
			case 4:
				System.out.println("Program has ended");
				System.exit(0);
			default:
				System.out.println("Inavlid option. Please enter number from 1-4");
			}
		
		}while(true);
	}

}
