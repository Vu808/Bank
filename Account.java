 
public abstract class Account {

	private double money;
	private int accountNumber;
	private static int month;
	private double withdrawal;
	private double deposit;
	
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
	
	
	public double getDeposit() {
		return deposit;
	}
	
	
	public double getWithdrawal() {
		return withdrawal;
	}
	
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public void setWithdrawal(double withdrawal) {
		this.withdrawal = withdrawal;
	}
	
	public double addDeposit() {
		double accountMoney = getMoney();
	 accountMoney =	accountMoney + getDeposit();
	 this.money = accountMoney;
	 return money;
	}
	
	public double subtractWithdrawal() {
		double accountMoney = getMoney();
		accountMoney = accountMoney - getWithdrawal();
		this.money = accountMoney;
		return money;
	}
		
	public static int getMonth() {
		return month;
	}
	
	
	public static void monthEnd() {
		month++;
		
	}
}
