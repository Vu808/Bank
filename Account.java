
public abstract class Account {

	private double money;
	private int accountNumber;
	private static int month;
	
	public Account(double money, int accountNumber) {
		this.money = money;
		this.accountNumber = accountNumber;
	}
	
	public double getMoney() {
		return money;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int getMonth() {
		return month;
	}
	
	public static void monthEnd() {
		month++;
	}
}
