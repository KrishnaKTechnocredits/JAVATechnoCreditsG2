/* Client class for Booking meeting room */
package purva;

import java.util.Scanner;

public class Purva_Assign3_MeetingRm_Client_q1 {
	public static void main(String[] args) {
		char ans = 'y';
		String room;
		double time;

		Purva_Assign3_MeetingRm_Service_q1 obj1 = new Purva_Assign3_MeetingRm_Service_q1();

		/*
		 * user asked name of meeting room know for booking, if yes it will book
		 * that room for time specified by user, else if user answers 'n' it
		 * will book Nalanda for 1 hr by default
		 */
		System.out.println(
				"\n" + "Do you know the meeting room you want to book for your meeting and hours required for meeting");
		Scanner sc1 = new Scanner(System.in);
		ans = sc1.next().charAt(0);

		/*
		 * if answer = y then book meeting room other than Nalanda for time
		 * specified by user and display meeting room details
		 */
		if ((ans == 'y') || (ans == 'Y')) {
			System.out.println("Select a meeting room from list {Takshashila, AgraFort, PratapGadh}: ");
			Scanner sc2 = new Scanner(System.in);
			room = sc2.nextLine();

			System.out.println("Select iime for which you require the meeting room: ");
			Scanner sc3 = new Scanner(System.in);
			time = sc3.nextDouble();

			obj1.bookMeetingRoom(room, time);
			obj1.displayInfo();
		}

		/*
		 * if answer = n then book meeting room other Nalanda for 1hr and
		 * display meeting room details
		 */
		else {
			obj1.bookMeetingRoom();
			obj1.displayInfo();
		}
	}

}
