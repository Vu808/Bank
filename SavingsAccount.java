
public class SavingsAccount extends Account {

	private static double rate = 0.05;
	private double interest;
	
	public SavingsAccount(double money, int accountNumber ) {
		super(money, accountNumber);
	
	}
	
	public double incrementInterest() {
		double temp = 0;
		for ( int i=0; i < Account.getMonth(); i++) {
			 temp = getMoney();
			temp = temp + calculateInterest();
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

