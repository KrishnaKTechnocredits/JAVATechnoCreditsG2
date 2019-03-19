//WAP to convert temperture from fahrenheit to Celsius degree C=(f-32)*5/9
package rahulM;
class Q6
{
	public static void main(String [] a)
	{
	float f = Float.parseFloat(a[0]);
	System.out.println("The temperture in celsius is: "+CTemp(f));
	}
	static float CTemp(float f)
	{
		float c = (f-32)*5/9;
		return c;
	}
}