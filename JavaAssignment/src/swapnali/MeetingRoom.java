package swapnali;

import java.util.Scanner;

	public class MeetingRoom 
	{
		String name;
		double hrs;
		int choice;
		static Scanner sc = new Scanner(System.in);
		double bookMeetingRoom()
		{
			System.out.println("Enter time: ");
			double hrs=sc.nextDouble();
			return hrs;
		}
		
		void displayInfo()
		{
			System.out.println(name +" Meeting room will be booked for " +hrs +" hours");
		}
		
		void OperationChoice() 
		{
			System.out.println("Menu: ");
			System.out.println("1.Takshashila");
			System.out.println("2.AgraFort");
			System.out.println("3.PratapGadh");
			System.out.println("0.Exit");
			do{
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
			
				switch (choice) {
				case 1:
					hrs=bookMeetingRoom();
					System.out.println("Takshashila meeting room is booked for duration: "+hrs);
					break;
				case 2:
					hrs=bookMeetingRoom();
					System.out.println("AgraFort meeting room is booked for duration: "+hrs);
					break;
				case 3:
					hrs=bookMeetingRoom();
					System.out.println("PratapGadh meeting room is booked for duration: "+hrs);
					break;
				
				case 0:
					break;
				default:
					System.out.println("Nalanda Meeting room will be booked for 1 hr");
				}
			
			}while(choice!=0);
		}
		public static void main(String[] args)
		{
			
			MeetingRoom obj = new MeetingRoom();
			obj.OperationChoice();
		}

}


