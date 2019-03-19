package shashank;

import java.util.Scanner;

public class MeetingRoom_Feb03 
{
	void bookMeetingRoom()
	{
		System.out.println("Meeting room 'Nalanda' is booked for 1 hour. Thanks!");
	}
	
	void bookMeetingRoom(String room, int hours)
	{
		MeetingRoom_Feb03 mr1= new MeetingRoom_Feb03();
		switch(room)
		{
		case "Takshashila": 
			mr1.displayBookInfo(room, hours);
			break;
		case "AgraFort": 
			mr1.displayBookInfo(room, hours);
			break;
		case "PratapGarh":
			mr1.displayBookInfo(room, hours);
			break;
		default: 
			System.out.println("This meeting room does not exist. Sorry!");
		}
	}
	
	void displayBookInfo(String room, int hour)
	{
		System.out.println("Meeting room "+room+" is booked for "+hour+" hours. Thanks!");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Please enter the meeting room to be booked - Nalanda, Takshashila, AgraFort or Pratapgarh : ");
		MeetingRoom_Feb03 mr1 = new MeetingRoom_Feb03();
		Scanner sc = new Scanner(System.in);
		String room = sc.next();
		System.out.println("Please enter the number of hours you want to book the meeting");
		int hours = sc.nextInt();
		if (room.equals("Nalanda") && hours==1)
			mr1.bookMeetingRoom();
		else if(room.equals("Nalanda") && hours!=1)
			System.out.println("Meeting room 'Nalanda' is not available for more than 1 hour. Sorry!");
		else 
			mr1.bookMeetingRoom(room, hours);
			
	}
}
