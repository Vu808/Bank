
public class CheckingAccount extends Account {

	private static int withdrawals;
	private double InitialMoney;
	
	
	public CheckingAccount(double money, int accountNumber) {
		super(money, accountNumber);
		InitialMoney = money;
	}
	
	public int getWithdrawals() {
		return withdrawals;
	}
	
	
	public int countWithdrawals() {
		
		if (getMoney() < InitialMoney); {
			
			withdrawals++;;
			System.out.println("You have made " + withdrawals + " withdrawals this month.");
			
			
		}
		
		return withdrawals;
		}
	
	public double checkWithdrawalLimit() {
		double accountMoney = getMoney();
		
		if (withdrawals > 3) {
			accountMoney = getMoney() - 1;
			InitialMoney = accountMoney;
			System.out.println("You have been charged a $1 withdrawal fee.");
			System.out.println("Your new balance is $" + accountMoney);
			setMoney(accountMoney);
			
		}
		
		return accountMoney;
	}
	
	public static int resetWithdrawals() {
		withdrawals = 0;
		return withdrawals;
	}
	
}
