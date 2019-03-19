package technoCredits.singletonDesignPattern;

//Egar initializaition of Singlonton Design patter
public class ConnectionE{
	private final String uname = "";
	private final String pwd = "";
	private final String url = "";
	
	final private static ConnectionE con = new ConnectionE();
	
	private ConnectionE()
	{
	}
	
	static ConnectionE getConnection()
	{
		return con;
	}
	
	void verifyUnamePwd(String uname, String pwd)
	{
		// database select , data fetch.
	}
}
