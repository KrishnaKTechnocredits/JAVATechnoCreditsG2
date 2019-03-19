package technoCredits.singletonDesignPattern;

// Lazy initializaition of Singlonton Design patter
public class Connection {
	private static Connection con=null;
	private Connection()
	{
		
	}
	
	static Connection getConnection()
	{
		if(con == null)
			con = new Connection();
		return con;
	}
	
	void verifyUnamePwd(String uname, String pwd)
	{
		// database select , data fetch.
	}
}
