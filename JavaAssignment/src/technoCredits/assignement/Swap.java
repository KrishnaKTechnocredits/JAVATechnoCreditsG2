package technoCredits.assignement;

public class Swap {

	public static void main (String [] args)
	{
		Swap a = new Swap();
		a.convsectohmin(Integer.parseInt(args[0]));
	}
	void convsectohmin(int secs)
	{
		int hour;int min;
		min=secs/60;
		
		if (min ==60)
			hour=(min/60)+1;
		else
			hour=min/60;
		int remin=min%60;
		int remsec=secs%60;
		System.out.println(secs +" Seconds =" + hour +" Hours:" +remin+"Minutes:"+remsec +"seconds");
		}
		
}
