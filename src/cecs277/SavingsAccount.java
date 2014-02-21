import java.util.Calendar;
/**
 * Class to create a savings account
 */
public class SavingsAccount extends BankAccount
{
	/**
	 * This creates the savings account type for a person
	 * @param person calling a person as a superclass
	 */
	public SavingsAccount(Person person)
	{
		super(person);
		setAccount("Savings Account. ");
	}
	/**
	 *  makes a super withdrawl
	 *  saves a date and amount
	 */
	public void makeWithdrawal(Calendar tDate, double amount) throws OverdrawnAccountException
	{
		super.makeWithdrawal(tDate, amount);
		Transaction trans = new Transaction(tDate, "Withdrawal", amount);
		super.addTransaction(trans, "Savings Account. ", -amount);
	}
	/**
	 * saves a date and amount
	 * makes a super deposit
	 */
	public void makeDeposit(Calendar tDate, double amount)
	{
		super.makeDeposit(tDate, amount);
		Transaction trans = new Transaction(tDate, "Deposit", amount);
		super.addTransaction(trans, "Savings Account. ", amount);
	}
	/**
	 * Calculates the interest amount
	 * @param tDate saves the transaction date
	 * @param amount saves the new amount as a double
	 */
	public void postInterest(Calendar tDate, double amount)
	{
		Transaction trans = new Transaction(tDate, "Interest", amount);
		super.addTransaction(trans, "Savings Account. ", amount);
	}
}
