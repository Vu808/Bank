import java.util.Scanner;
public class ATM {
	
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		String selection = null;
		boolean notQ = true;
		int savingsAccounts = 0;
		int checkingAccounts = 0 ;
		SavingsAccount[] savingsAccountArray = new SavingsAccount[10];
		CheckingAccount[] checkingsAccountArray = new CheckingAccount[10];
		
		
		while (notQ) {
		System.out.println("Hello! Welcome to Vu's Bank!");
		System.out.println();
		System.out.println("S)aving Account Creation");
		System.out.println("C)hecking Account Creation");
		System.out.println("D)eposit");
		System.out.println("W)ithdrawal");
		System.out.println("M)onth End");
		System.out.println("Q)uit");
		System.out.println("");
		System.out.println("Please select an option(capital letter) ");
		 selection = scnr.next();
		 System.out.println("");
		
		if (selection.equals("S")) {
			int accountNumber;
			double money;
			int accounts;
			
			System.out.println("How many accounts would you like to create? (Maximum 10)");
			accounts = scnr.nextInt();
			savingsAccounts = accounts;
			for (int i=0; i < accounts; i++) {
			System.out.println("Please create a 6 digit account number");
			accountNumber = scnr.nextInt();
			System.out.println("How much money would u like to initially deposit?(No dollar symbol please) ");
			money = scnr.nextInt();
			savingsAccountArray[i] = new SavingsAccount(money, accountNumber);
			System.out.println("This savings account has been assigned number " + i);
			System.out.println("");
			}
			
			System.out.println("Your account(s) have been created!");
			System.out.println("");
	}
		
		if (selection.equals("C")) {
			int accountNumber;
			double money;
			int accounts;
			
			System.out.println("How many accounts would you like to create? (Maximum 10)");
			accounts = scnr.nextInt();
			checkingAccounts = accounts;
			for (int i=0; i < accounts; i++) {
			System.out.println("Please create a 6 digit account number");
			accountNumber = scnr.nextInt();
			System.out.println("How much money would u like to initially deposit?(No dollar symbol please) ");
			money = scnr.nextInt();
			checkingsAccountArray[i] = new CheckingAccount(money, accountNumber);
			System.out.println("This checkings account has been assigned number " + i);
			System.out.println("");
			}
			
			System.out.println("Your account(s) have been created!");
			System.out.println("");
		}
		
		if (selection.equals("D")) {
			String choice;
			int accountAssignment;
			double depositAmount;
			System.out.println("Is this an S)avings or C)heckings account?");
			choice = scnr.next();
			System.out.println("");
			if (choice.equals("S")) {
				System.out.println("Please enter the number assigned to the account you wish to deposit into");
				accountAssignment = scnr.nextInt();
				if (savingsAccountArray[accountAssignment].queryAccountNumber() == true) {
					System.out.println("How much would you like to deposit?(No $ sign)");
					depositAmount = scnr.nextInt();
					savingsAccountArray[accountAssignment].setDeposit(depositAmount);
					savingsAccountArray[accountAssignment].getDeposit();
					System.out.println("");
					savingsAccountArray[accountAssignment].addDeposit();
					System.out.println("");
				}
			} if (choice.equals("C")) {
				System.out.println("Please enter the number assigned to the account you wish to deposit into");
				accountAssignment = scnr.nextInt();
				if (checkingsAccountArray[accountAssignment].queryAccountNumber() == true) {
					System.out.println("How much would you like to deposit?(No $ sign)");
					depositAmount = scnr.nextInt();
					checkingsAccountArray[accountAssignment].setDeposit(depositAmount);
					checkingsAccountArray[accountAssignment].getDeposit();
					System.out.println("");
					checkingsAccountArray[accountAssignment].addDeposit();
					System.out.println("");
			}
		}
		}
		
		if (selection.equals("W")) {
			String choice;
			int accountAssignment;
			double withdrawalAmount;
			System.out.println("Is this an S)avings or C)heckings account?");
			choice = scnr.next();
			System.out.println("");
			if (choice.equals("S")) {
				System.out.println("Please enter the number assigned to the account you wish to withdraw from");
				accountAssignment = scnr.nextInt();
				if (savingsAccountArray[accountAssignment].queryAccountNumber() == true) {
					System.out.println("How much would you like to withdraw?(No $ sign)");
					withdrawalAmount = scnr.nextInt();
					savingsAccountArray[accountAssignment].setWithdrawal(withdrawalAmount);
					savingsAccountArray[accountAssignment].getWithdrawal();
					System.out.println("");
					savingsAccountArray[accountAssignment].subtractWithdrawal();
					System.out.println("");
				}
			} if (choice.equals("C")) {
				System.out.println("Please note, after 3 withdrawals within a month, your account will be charged $1 for each additional withdrawal");
				System.out.println("Please enter the number assigned to the account you wish to withdraw from");
				accountAssignment = scnr.nextInt();
				if (checkingsAccountArray[accountAssignment].queryAccountNumber() == true) {
					System.out.println("How much would you like to withdraw?(No $ sign)");
					withdrawalAmount = scnr.nextInt();
					checkingsAccountArray[accountAssignment].setWithdrawal(withdrawalAmount);
					checkingsAccountArray[accountAssignment].getWithdrawal();
					System.out.println("");
					checkingsAccountArray[accountAssignment].subtractWithdrawal();
					checkingsAccountArray[accountAssignment].countWithdrawals();
					checkingsAccountArray[accountAssignment].checkWithdrawalLimit();
					System.out.println("");
			}
		}
		}
		
		if (selection.equals("M")) {
			Account.monthEnd();
			Account.getMonth();
			CheckingAccount.resetWithdrawals();
			for (int i=0; i < savingsAccounts; i++) {
				savingsAccountArray[i].calculateInterest();
				savingsAccountArray[i].incrementInterest();
				System.out.println("After interest, your new account balance for Savings Account " + i + " is $" + Math.round(savingsAccountArray[i].getMoney() * 100.0) / 100.0);
				
			}
		}
		
		
		if (selection.equals("Q")) {
			notQ = false;
		} 
		
		}
		
		System.out.println("Please come again!");
	}

}
			
	

