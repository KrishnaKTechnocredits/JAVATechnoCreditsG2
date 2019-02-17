package technoCredits.constructor;

public class Student {

	static String name = "Maulik";
	static int rno;
	
	Student() //3
	{ //4
		System.out.println("Student class constructor"); //5
	} //6
	
	Student(int stdRno) 
	{ 
		rno = stdRno; //
		System.out.println("Student class one param constructor"); //5
		
	} 
	public static void main(String[] args) {
		System.out.println("Main Start"); //1
		Student s1 = new Student(10); //2 //7
		System.out.println("s1 created"); //8
		
		Student s2 = new Student();
		System.out.println("s2 created");
		
		System.out.println("Main end");
	}
	
}
