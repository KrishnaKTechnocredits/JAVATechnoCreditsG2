package rashmi;

public class Area 
{
      int totalarea,length,breadth,height,radius;
	  double perimeter;
	 
	  void areaofrectangle(int length,int breadth,int height)
	  {
	    totalarea=length*breadth*height;
	    System.out.println(totalarea);
	  }
	 
	  void perimeterofcircle(int radius)
	  {
	     perimeter=2*3.14*radius*radius;
	     System.out.println(perimeter);
	  }

	  public static void main(String[] args)
	  {
	    Area a1=new Area();
	    a1.areaofrectangle(3,5,7);
	    a1.perimeterofcircle(5);
	  }
}
