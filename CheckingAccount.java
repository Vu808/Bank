
public class CheckingAccount extends Account {

	private int withdrawals;
	private double InitialMoney;
	
	
	public CheckingAccount(double money, int accountNumber) {
		super(money, accountNumber);
		InitialMoney = money;
	}
	
	public int getWithdrawals() {
		return withdrawals;
	}
	
	
	public int countWithdrawals() {
		withdrawals = 0;
		if (getMoney() < InitialMoney) {
			
			withdrawals++;
			
			
		}
		this.withdrawals = withdrawals;
		return withdrawals;
		}
	
	public double checkWithdrawalLimit() {
		double accountMoney;
		accountMoney = getMoney();
		if (withdrawals > 3) {
			accountMoney = getMoney() - 1;
		}
		
		return accountMoney;
	}
	
}
