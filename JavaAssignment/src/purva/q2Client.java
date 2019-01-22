package purva;

public class q2Client {
	public static void main(String[] a)

	{
		int rno = Integer.parseInt(a[0]);
		String name = a[1];
		float marks = Float.parseFloat(a[2]);

		q2Service det = new q2Service();
		det.studdet(rno, name, marks);

	}

}
