package vrushali;

public class StudentDetails {
	
	
	public static void main(String[] args) {

		int rollNum = Integer.parseInt(args[0]);
		String name = args[1];
		int marks = Integer.parseInt(args[2]);
		
		StudentDetails s = new StudentDetails();
		s.studentInfo(rollNum, name, marks);
	}
    void studentInfo(int rollNum, String name, int marks){
    	System.out.println("Student with name "+name+ " and roll number "+ rollNum + 
    			" is having marks "+marks);
    }
}
