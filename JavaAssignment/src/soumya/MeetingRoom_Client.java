/*
 * This Program will book meeting room by selecting hour and meeting room name
 */
package soumya;

import java.util.Scanner;

public class MeetingRoom_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MeetingRoom book = new MeetingRoom();
		System.out.println("Select Meeting room: ");
		System.out.println("1.Nalanda");
		System.out.println("2.Takshashila");
		System.out.println("3.AgraFort");
		System.out.println("4.PratapGadh");
		int roomNum = sc.nextInt();
		System.out.println("Enter hour");
		int hr = sc.nextInt();
		sc.close();
		book.display(hr, roomNum);
	}
}
