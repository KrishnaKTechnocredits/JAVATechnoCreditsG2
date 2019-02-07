package arpita;

public class StudentQ2 {
	int Rollno;
	String Name;
	int Marks;
	
	public static void main(String[] args) {
		StudentQ2 s=new StudentQ2();
		s.Rollno=10;
		s.Name= "Arpit";
		s.Marks=462;
		print(s);
		
	}
	public static void print(StudentQ2 stu)
	{
		System.out.println("stu Name: " + stu.Name + " Rollno: "+ stu.Rollno + " Marks: "+ stu.Marks);
	}

}
