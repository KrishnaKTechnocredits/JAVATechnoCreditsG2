package switchcase;

import java.util.Scanner;

public class WeekdayName {
 void printDayName(){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the input number: ");
	 int inputNum=sc.nextInt();
	 inputNum =inputNum % 7;
	 String day="";
	 switch(inputNum){
	 case 0:
		 day="Sunday";
		 break;
	 case 1:
		 day="Monday";
		 break;
	 case 2:
		 day="Tuesday";
		 break;
	 case 3:
		 day="Wednesday";
		 break;
	 case 4:
		 day="Friday";
		 break;
	 case 5:
		 day="Saturday";
		 break;
	 case 6:
		 day="Sunday";
		 break;	 
	 
	 }
	 System.out.println("Day is : "+day);
 }
 public static void main(String[] args) {
	WeekdayName dayname = new WeekdayName();
	dayname.printDayName();
}
}
