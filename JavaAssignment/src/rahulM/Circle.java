package constructor;

public class Circle {
	float radius ;
	double pi =3.14;
	 void area(float radius){
		 this.radius=radius;
		 System.out.println("Area of circle is :"+(pi*radius*radius));
	 }
	 void circumference(float radius){
		 this.radius=radius;
		 System.out.println("Area of circle is :"+(2*pi*radius));
	 }

}
