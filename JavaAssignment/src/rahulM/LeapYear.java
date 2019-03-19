//Take year from user and print if leap year or not
package switchcase;

import java.util.Scanner;

public class LeapYear {

	public static void main(String args[])
    {
        LeapYear lpyear= new LeapYear();
        lpyear.leapYearFinder();
       
}
	void leapYearFinder(){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = sc.nextInt();
        
        if(year % 400 == 0|| (year%4==0 && year%100!=0)){
        	System.out.println(year+" is a leap year");
        }
        else{
        	System.out.println(year+" is not a leap year");
        }
        sc.close();
	}
}
