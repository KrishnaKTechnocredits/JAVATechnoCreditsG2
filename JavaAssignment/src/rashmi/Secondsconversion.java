package rashmi;

public class Secondsconversion 
{
    static void convertTohr(int sec)
    {
    	double hour=sec/3600;
    	System.out.println(hour);
    }
    static void convertTomin(int sec)
    {
    	double min=sec/60;
    	System.out.println(min);
    }
    
	public static void main(String[] args) 
	{
		int sec=Integer.parseInt(args[0]);
        convertTohr(sec);
        convertTomin(sec);
	}

}
