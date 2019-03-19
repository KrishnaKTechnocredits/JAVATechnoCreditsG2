package technoCredits.singletonDesignPattern;

//Egar initializaition of Singlonton Design patter
public class Client {

	public static void main(String[] args) {
		Connection con = Connection.getConnection();
		con.verifyUnamePwd("mmk", "mmkmmk");
		
		//Connection.con = null;
		
		Connection con1 = Connection.getConnection();
		con1.verifyUnamePwd("mmk1", "mmkmmk1");
		
		
		System.out.println(con);
		System.out.println(con1);
		
	}
}
