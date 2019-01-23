package swapnali;

public class StudentData {

	public static void main(String[] args)
	{
		int rNo = Integer.parseInt(args[0]);
		String Name =args[1];
		int Marks = Integer.parseInt(args[2]);
		StudentData sd = new StudentData();
		sd.StudentDetails(rNo, Name, Marks);
		
	}
	
	void StudentDetails(int rNo,String Name,int Marks)
	{
		System.out.println("The student details are "+rNo +" "+Name+" " +Marks);
	}
}
