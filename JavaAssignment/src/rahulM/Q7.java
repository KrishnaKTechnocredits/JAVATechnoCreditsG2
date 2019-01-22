//WAP to convert seconds to hour minute and seconds
package rahulM;
class Q7
{
 static int s;	
 public static void main(String[] a)
 {
 int s = Integer.parseInt(a[0]);
 System.out.println("in hours : "+hours(s)+"\nIn minutes :"+mins(s)+ "\nIn seconds :"+s);
 }
 static float hours(int s)
 {
	float h = (float)s/(60*60);
    return h;	
 }
 static float mins(int s)
 {
	 float m = (float)s/60;
	 return m;
 }
 
}