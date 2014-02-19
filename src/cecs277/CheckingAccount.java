/**
* CECS 277 Spring 2014 Assignment 2
* @author Dean Garcia 3996
* @author Michael Valenzuela 5522
**/
package cecs277;
import java.util.Calendar;

public class CheckingAccount extends BankAccount 
{
	/**
	 * This creates the checking account type for a person
	 * @param person calling a person as a superclass
	 */
	public CheckingAccount(Person person) 
	{
		super(person);
		setAccount("Checking Account. ");
	}
	/**
	*  makes a super withdrawl
 	*  saves a date and amount
	*/
	public void makeWithdrawal(Calendar tDate, double amount) throws OverdrawnAccountException
	{
		super.makeWithdrawal(tDate, amount);
		Transaction trans = new Transaction(tDate, "Withdrawal", amount);
		super.addTransaction(trans, "Checking Account. ", -amount);
	}
	 /**
	 * saves a date and amount
 	 * makes a super deposit
	 */
	public void makeDeposit(Calendar tDate, double amount) 
	{
		super.makeDeposit(tDate, amount);
		Transaction trans = new Transaction(tDate, "Deposit", amount);
		super.addTransaction(trans, "Checking Account. ", amount);
	}
	/**
	 * Calculates a fee for using the checking account
	 * @param tDate records the date of use
	 * @param fee records the fee amount
	 */
	public void chargeFee(Calendar tDate, double fee) 
	{
		Transaction trans = new Transaction(tDate, "Fee", fee);
		super.addTransaction(trans, "Checking Account. ", -fee);
	}
}