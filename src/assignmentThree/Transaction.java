
/**
* CECS 277 Spring 2014 Assignment 2
* @author Dean Garcia 3996
* @author Michael Valenzuela 5522
**/
package assignmentThree;
import java.util.Calendar;

/**
 * 
 * Represents a peron's transactions
 * keeps track of person's balance and transaction dates
 * 
 * 
 */

public class Transaction

{

	/**
	 * Intializes the balance to 0 
	 */
	public Transaction()

	{

		_balance = 0;

		_accountType = "Special Account. ";

	}
/**
 * creates a transaction and records the date, type, and amount
 * @param date date of transaction
 * @param type type of account 
 * @param amount the amount
 */
	public Transaction(Calendar date, String type, double amount)

	{

		_date = date;

		_type = type;

		_amount = amount;

	}

	/**
	 * returns account type as a string
	 * @return gets account type
	 */
	public String getType()

	{

		return _type;

	}

	/**
	 * returns date as a calendar date
	 * @return get the date
	 */
	public Calendar getDate()

	{

		return _date;

	}

	/**
	 * returns the amount as a double
	 * @return gets the amount 
	 */
	public double getAmount()

	{
		return _amount;
	}

	/**
	 * sets the balance to the amount + or - the current balance
	 * @param amount from transaction
	 */
	public void setBalance(double amount)

	{

		_balance += amount;
	}
	/**
	 * Shows current balance
	 * @return gets the new balance
	 */
	public double getBalance()

	{
		return _balance;

	}

	/**
	 * Sets accountType string to _accountType
	 * @param accountType
	 */
	public void setAccountType(String accountType)

	{
		_accountType = accountType;
	}

	/**
	 * gets the account type either savings or checkings
	 * @return the account type
	 */
	public String getAccountType()

	{

		return _accountType;
	}

	/**
	 * Date of transaction as a calendar date
	 * Type as a string
	 * amount as a double
	 * accountType as a string
	 * balance as a double
	 */
	private Calendar _date;

	private String _type;

	private double _amount;

	private String _accountType;

	private double _balance;

}
