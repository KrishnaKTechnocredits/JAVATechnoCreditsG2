/* this is service class for Booking meeting room */
package purva;

public class Purva_Assign3_MeetingRm_Service_q1 {

	String bookedRoomName;
	double hr;

	/*
	 * this method will book Nalanda for 1 hr if you dont know meeting room name
	 * and hrs required for meeting
	 */
	void bookMeetingRoom() {
		bookedRoomName = "Nalanda";
		hr = 1.0;
	}

	/*
	 * this method will book other than Nalanda for hr input by user if you know
	 * meeting room name and hrs required for meeting
	 */
	void bookMeetingRoom(String nameRoom, double hrs) {
		bookedRoomName = nameRoom;
		hr = hrs;
	}

	/*
	 * this method displays details of booked meeting room and time for which
	 * meeting room is booked
	 */
	void displayInfo() {
		System.out.println("\n" + "Booking details: ");
		System.out.println("Name of Meeting room name booked for you is " + bookedRoomName);
		System.out.println("Room " + bookedRoomName + " is booked for " + hr + " hrs");
	}
}
