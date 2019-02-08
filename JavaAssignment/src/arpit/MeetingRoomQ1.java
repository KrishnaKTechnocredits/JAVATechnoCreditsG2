package arpit;

import java.util.Scanner;

public class MeetingRoomQ1 {
	
	String meetingRoom;
	float time;
	
	//This method show NALANDA meeting room as a default for ONE hour
	void bookMeetingRoom()
	{
		System.out.println("Room booked for Meeting is: NALANDA for ONE hour only");
	}
	
	//This method take name of meeting room and duration from user and update it in instance variable.
	void bookMeetingRoom(String meetingRoom, float time )
	{
		this.meetingRoom = meetingRoom;
		this.time = time;
	}
	
	//This function display the name of meeting room and its duration
	void display()
	{
		System.out.println("Meeting Room booked for meeting is: "+ meetingRoom + ", booked for "+ time + " hour");
	}
	
	public static void main(String[] args) {
		
		//Creating object of the class
		MeetingRoomQ1 meetingRoom = new MeetingRoomQ1();
		
		//Call default bookMeetingRoom method
		meetingRoom.bookMeetingRoom();
		
		//Details of the available meeting room
		System.out.println("Meeting Room available other than Nalana is: ");
		System.out.println("Takshashila, AgraFort, PratapGadh");
		
		//Creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the name of Meeting Room from above:");
		
		//Take the name of meeting room which will be given by user
		String meetRoom = sc.next();
		
		System.out.println("Time of duration:");
		
		//Store the time which will be given by user
		float time = sc.nextFloat();
		
		//Call the method which have two parameter and provide input to that method
		meetingRoom.bookMeetingRoom(meetRoom, time);
		
		//Call the display method
		meetingRoom.display();
	}



}
