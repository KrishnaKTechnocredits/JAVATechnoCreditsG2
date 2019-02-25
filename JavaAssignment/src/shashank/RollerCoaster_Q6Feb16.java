package shashank;

import java.util.Scanner;


public class RollerCoaster_Q6Feb16 
{
	public static void main(String[] args) throws CustomisedException 
	{
		RollerCoaster_Q6Feb16 ud = new RollerCoaster_Q6Feb16();
		System.out.println("Please enter to check your eligibility: ");
		Scanner sc = new Scanner(System.in);
		ud.entryCheck(sc.nextInt());
	}
	
	void entryCheck(int age) throws CustomisedException
	{
		if (age<12)
			throw new CustomisedException("You should have come after "+(12-age)+" years");
		else if (age>=12 && age<=60)
			System.out.println("Entry allowed!");
		else if (age>60)
			throw new CustomisedException("You should have come before "+(age-60)+" years");
		else
			System.out.println("Invalid input!");
	}
}
