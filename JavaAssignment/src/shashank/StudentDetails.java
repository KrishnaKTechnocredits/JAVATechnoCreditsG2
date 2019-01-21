package shashank;

public class StudentDetails 
{
	static void displayStudentDetails(int rNo, String name, float marks)
	{
		System.out.println("Student with name "+name+" and roll number "+rNo+" has received "+marks+"% in Java programming.");
	}
	
	public static void main(String[] args) 
	{
		StudentDetails.displayStudentDetails(Integer.parseInt(args[0]), args[1], Float.parseFloat(args[2]));
	}
}
