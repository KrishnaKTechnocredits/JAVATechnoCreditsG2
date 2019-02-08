package rashmi;

import java.util.Scanner;

public class MeetingRoom 
{
	String name;
	double hrs;
	void bookMeetingRoom()
	{
		System.out.println("Nalanda Meeting room will be booked for 1 hr");
	}
	void bookMeetingRoom(String name,double hrs)
	{
		this.name=name;
	    this.hrs=hrs;
		
	}
	void displayInfo()
	{
		System.out.println(name +" Meeting room will be booked for " +hrs +" hours");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String meetingroom=sc.next();
		double hr=sc.nextDouble();
		MeetingRoom obj = new MeetingRoom();
		obj.bookMeetingRoom();
		obj.bookMeetingRoom(meetingroom,hr);
		obj.displayInfo();
	}

}
