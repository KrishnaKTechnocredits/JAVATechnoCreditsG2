/* 
 * This Program will verify bank operations like insert data,deposit,withdraw,balance check and displaying details
 */
package soumya;

public class BankClient {
	public static void main(String[] args) {
		Bank bankOperation = new Bank();
		bankOperation.inputOutput();
		bankOperation.check();
	}
}
