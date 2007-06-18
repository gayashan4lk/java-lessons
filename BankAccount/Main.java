import java.util.Scanner;

/**
 * This contains some test code for our BankAccount and Person classes.
 * It constructs a bank account for a person named Mike.
 *
 * @author Michael Gordon
 */
public class Main {
	
	/**
	 * This is the entry point for testing our BankAccount and person 
	 * classes.  It creates a single bank account and asks the user for 
	 * an amount to withdraw.
	 *
	 * @param args The command line arguments (not used)
	 */
	public static void main(String[] args) {
		//create a new account for me!
		BankAccount myAcc;
		myAcc = new BankAccount(new Person("Mike"), 1000.0);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Current balance " + myAcc.getBalance());
		System.out.print("Enter amount to withdraw: ");
		double amount = input.nextDouble();
		
		//withdraw amount from my account if possible!
		if (myAcc.withdraw(amount))
			System.out.println("Withdraw successful!");
		else 
			System.out.println("Withdraw unsucessful!");
			
		System.out.println("Current balance " + myAcc.getBalance());
			
	}
}