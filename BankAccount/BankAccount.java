/**
 * This class represents a bank account with a single holder and 
 * a balance.  One can withdraw money from the account as long as there
 * is enough money in the account and one can deposit money into the account.
 * 
 * @author Michael Gordon
 */
public class BankAccount {
	/** the current balance of the account */
	private double balance;
	/** the name of the account's holder */
	private Person person;
	
	/**
	 * Bank account constructor, pass the name of the account's
	 * holder and the initial balance.
	 * 
	 * @param person The individual who holds the account
	 * @param openBalance The value of the opening balance, should be
	 *                    greater than or equal to zero
	 */
	public BankAccount(Person person,
			    double openBalance){
		this.person = person;
		this.balance = openBalance; 
	}
	
	/**
	 * Desposit amount in this account's balance and return
	 * the new value of balance with amount added to it.  Subtract
	 * the fee from the account as well.
	 * 
	 * @param amount The amount to desposit into this account
	 *
	 * @return The new balance of the account with the amount deposited
	 */
	public double deposit(double amount) {
		balance += amount;
		fee(5.0); 
		return balance;
	}
	
	/**
	 * Withdraw amount from this account but make sure that we 
	 * sufficient funds to withdraw.  
	 *
	 * @param amount The monetary amount that we are going to attempt
	 *               to withdraw from this account.
	 *
	 * @return If the withdrawl was successful return true, if we 
	 *         cannot withdraw amount because of insufficient 
	 *         funds, then return false.
	 */
	public boolean withdraw(double amount) {
		if (amount < balance) {
			balance -= amount;
			fee(10.0);
			return true;
		} 
		else 
			return false;
 	}

 	
 	/**
 	 * Charge a fee to this account but subtracting amount from the
 	 * balance.
 	 *
 	 * @param The amount of the fee to process
 	 */
 	private void fee(double amount) {
 		balance -= amount;
 	}
 	
 	/** 
 	 * Get the current balance for this account 
 	 *
 	 * @return The current balance
 	 */
 	public double getBalance() {
 		return balance;
 	}	
}

	
	
	
	 