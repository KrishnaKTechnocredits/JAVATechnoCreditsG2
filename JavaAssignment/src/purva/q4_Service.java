package purva;

public class q4_Service 
{
	static double pi = 3.14159;
	void AreaRectangle(float w, float h)
	{
		float area_r=w*h;
		System.out.println("Area of Rectangle is "+area_r);		
	}
	void AreaCircle(float r)
	{
		double area_c=pi*r*r;
		System.out.println("Area of Circle is "+area_c);		
	}
	void PerimeterRect(float w, float h)
	{
		float per_rect=2*w*h;
		System.out.println("Perimeter of Rectangle is "+per_rect);	
	}
	void PerimeterCircle(float r)
	{
		double peri_cir=2*pi*r;
		System.out.println("Perimeter of Circle is "+peri_cir);	
	}
}
