
public class SavingsAccount extends Account {

	private static double rate = 0.05;
	private double interest;
	private double initialMoney;
	
	public SavingsAccount(double money, int accountNumber ) {
		super(money, accountNumber);
	initialMoney = money;
	}
	
	public double incrementInterest() {
		double temp = getMoney();
		for ( int i=0; i < Account.getMonth(); i++) {
			initialMoney = temp;
			temp = temp + calculateInterest();
			setMoney(temp);
			}
		
		
		
		return temp;
	}
		
	
	
	public void setRate(double Rate) {
		this.rate = rate;
	}
		
		public double calculateInterest() {
		double interest = getMoney() * rate;
		return interest;
		}
	}

