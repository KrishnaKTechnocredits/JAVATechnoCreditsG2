package soumya;

public class MeetingRoom {
	String room = "";
	int time = 0;

	// Default method for booking meeting room
	void bookMeetingRoom() {
		room = "Nalanda";
		time = 1;
	}

	// Method for booking meeting room by giving two parameters
	void bookMeetingRoom(String room, int time) {
		this.room = room;
		this.time = time;
	}

	// Method for displaying booked meeting room and duration
	void display(int hr, int roomNum) {
		if (hr == 1) {
			bookMeetingRoom();
		} else if (hr >= 2) {
			switch (hr) {
			case 2:
				bookMeetingRoom("Takshashila", 2);
				break;
			case 3:
				bookMeetingRoom("AgraFort", 3);
				break;
			case 4:
				bookMeetingRoom("PratapGadh", 4);
				break;
			default:
				System.out.println("No Meeting Room Available");
			}
		}
		System.out.println(room + " meeting room booked for " + time + " hr");
	}
}
