/**
* CECS 277 Spring 2014 Assignment 2
* @author Dean Garcia 3996
* @author Michael Valenzuela 5522
**/
package cecs277;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents the Bank Allows user to create accounts, bank manager, and the
 * bank name
 */
public class Bank implements Displayable
{
	/**
	 * @param name is the name of the bank as type string
	 * @param manager the person information for manager
	 */
	public Bank(String name, Person manager)
	{
		_name = name;
		_manager = manager;
		_accounts = new ArrayList<BankAccount>();
	}
	/**
	 * @param account creates a bankaccount for a person and records their information
	 */
	public void addAccount(BankAccount account) throws DuplicateAccountException
	{
		String type = "";
		if(account.getAccountType().equals("Checking Account. "))
		{
			type = "Checking";
		}
		else 
			type = "Savings";
		
		String temp = "Duplicate Account: Owner: " + account.getOwner().getCheck() + ", " + "Type: " + type;
		for(int i = 0; i < _accounts.size(); i++)
		{
			if(account.getOwner().getCheck().equals(_accounts.get(i).getOwner().getCheck()) && account.getAccountType().equals(_accounts.get(i).getAccountType()))
			{
				throw new DuplicateAccountException(temp);
			}
		}
		_accounts.add(account);
	}
	/**
	 * gets the account information
	 * @return returns the account
	 */
	public ArrayList<BankAccount> getAccount()
	{
		return _accounts;
	}
	/**
	 * @return gets the manager information
	 */
	public Person getManager()
	{
		return _manager;
	}
	/**
	 * @return gets the name of the bank
	 */
	public String getBankName()
	{
		return _name;
	}
	@Override
	/**
	 *  Displays the information as sorted and unsorted
	 *  Displays the account type, owner, balance, transactions
	 */
	public String getDisplay(boolean sorted)
	{
		String display = "";
		SimpleDateFormat dob = new SimpleDateFormat("MM-dd-yyyy");
		ArrayList<BankAccount> temp = new ArrayList<BankAccount>();
		for (int i = 0; i < _accounts.size(); i++)
		{
			temp.add(_accounts.get(i));
		}
		if(sorted)
		{
			Collections.sort(temp);
			display = "Sorted\n" + "Bank Name: " + getBankName()
					+ "\nManager: " + getManager().getFirstName() + " "
					+ getManager().getLastName() + " " + dob.format(getManager().getbirthDate().getTime()) + "\n"
					+ "Accounts\n";

			for (int i = 0; i < temp.size(); i++)
			{
				display += temp.get(i).getAccountType() + "Owner: "
					    + temp.get(i).getOwner().getFirstName()
						+ " " + temp.get(i).getOwner().getLastName() + " "
						+ dob.format(temp.get(i).getOwner().getbirthDate().getTime()) + ", Balance: " 
						+ new DecimalFormat("#.00").format(temp.get(i).getBalance())
						+ "\n" + temp.get(i).getTransactions() + " "+ "\n";
			}
		}
		else
		{
			display = "Unsorted\n" + "Bank Name: " + getBankName()
					+ "\nManager: " + getManager().getFirstName() + " "
					+ getManager().getLastName() + " " 
					+ dob.format(getManager().getbirthDate().getTime()) + "\n";

			for (int i = 0; i < _accounts.size(); i++)
			{
				display += _accounts.get(i).getAccountType()
						+ "Owner: " + _accounts.get(i).getOwner().getFirstName()
						+ " " + temp.get(i).getOwner().getLastName() + " " 
						+ dob.format(_accounts.get(i).getOwner().getbirthDate().getTime())
						+ ", Balance: " + new DecimalFormat("#.00").format(_accounts.get(i).getBalance()) + "\n"
						+ _accounts.get(i).getTransactions() + " " + "\n";
			}
		}
		return display;
	}
	
	/**
	 * _name of the bank as a string
	 * information of the manager as a Person
	 * initializes the arraylist of accounts as bankaccount
	 */
	private String _name;
	private Person _manager;
	private ArrayList<BankAccount> _accounts;
}