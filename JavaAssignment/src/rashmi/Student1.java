package rashmi;

public class Student1 
{
    static void display(int rolnum, String name, int marks)
    {
       System.out.println("Roll num : "+rolnum);
       System.out.println("Name : "+name);
       System.out.println("Marks : "+marks);
    }
	public static void main(String[] args) 
	{
		int rolnum=Integer.parseInt(args[0]);
		String name=args[1];
		int marks=Integer.parseInt(args[2]);
		display(rolnum,name,marks);

	}

}
