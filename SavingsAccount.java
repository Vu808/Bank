
public class SavingsAccount extends Account {

	private static double rate = 0.05;
	private double interest;
	
	public SavingsAccount(double money, int accountNumber, double interest ) {
		super(money, accountNumber);
	this.interest = interest;
	}
	
	public double getInterest() {
		return interest;
		
	}
	
	public void setRate(int Rate) {
		this.rate = rate;
	}
		
		public void calculateInterest() {
		interest = getMoney() * rate;	
		}
	}

