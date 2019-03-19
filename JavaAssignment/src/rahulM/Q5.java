//WAP to compute simple interest(p*t*r/100).
package rahulM;
class Q5
{
	public static void main(String [] a)
	{
		int p = Integer.parseInt(a[0]);
		int t = Integer.parseInt(a[1]);
		float r = Float.parseFloat(a[2]);
		System.out.println("The simple interest is rupees: "+SI(p,t,r));
	}
	static float SI(int p, int t,  float r)
	{
		float i = p*t*r/100;
		return i;
	}
}