/**
* CECS 277 Spring 2014 Assignment 2
* @author Dean Garcia 3996
* @author Michael Valenzuela 5522
**/
package assignmentThree;
import java.text.DecimalFormat;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.Calendar;

import java.lang.Comparable;
/**
 * 
 * This creates a bankaccount for a person and tracks transactions, withdrawl, and deposit
 *
 */
public abstract class BankAccount implements Comparable<BankAccount>

{
/**
 * gets information of person and records transaction date
 * @param owner information of person and bankaccount
 */
public BankAccount(Person owner)

{

_owner = owner;

_transactions = new ArrayList<Transaction>();

Transaction trans = new Transaction();

_transactions.add(trans);

}
/**
 * records transaction as a withdrawl
 * @param tDate the date as a calendar date
 * @param amount the withdrawl amount as a double
 */
public void makeWithdrawal(Calendar tDate, double amount)

{

Transaction trans = new Transaction(tDate, "Withdrawal", amount);

_transactions.add(trans);

_transactions.get(0).setBalance(-amount);

}
/**
 * records the transaction as a deposit
 * @param tDate the date as a calendar date
 * @param amount the deposit amount
 */
public void makeDeposit(Calendar tDate, double amount)

{

Transaction trans = new Transaction(tDate, "Deposit", amount);

_transactions.add(trans);

_transactions.get(0).setBalance(amount);

}
/**
 * adds transaction to list of transactions
 * @param trans transactions
 * @param type the account type
 * @param amount the amount
 */
public void addTransaction(Transaction trans, String type, double amount)

{

_transactions.add(trans);

_transactions.get(0).setAccountType(type);

_transactions.get(0).setBalance(amount);

}
/**
 *  gets the transaction
 * @return retruns the information of the transaction
 */
public String getTransactions()

{

String allTransactions = "";

SimpleDateFormat dob = new SimpleDateFormat("MM-dd-yyyy");

for(int i = 1; i < _transactions.size(); i++)

{

allTransactions += 

dob.format(_transactions.get(i).getDate().getTime()) + " "

 + _transactions.get(i).getType() + " " 

 + new 

DecimalFormat("#.00").format(_transactions.get(i).getAmount()) + "\n";

}

return allTransactions;

}
/**
 *  Gets the owner of the account
 * @return the owner of the account
 */
public Person getOwner()

{

return _owner;

}
/**
 * gets the account type
 * @return the account type 
 */
public String getAccountType()

{

String type = "";

type = _transactions.get(0).getAccountType();

return type;

}
/**
 * gets the balance of the account
 * @return the new balance
 */
public double getBalance()

{

double balance = 0;

balance = _transactions.get(0).getBalance();

return balance;

}
/**
 * compares the bank accounts to their current balance.
 * then returns the difference
 */
public int compareTo(BankAccount aAccount)

{

double myBalance = getBalance();

double accountBalance = aAccount.getBalance();

int difference = (int)(myBalance - accountBalance);

if(difference == 0)


difference = Double.compare(getBalance(), aAccount.getBalance());

return difference;

}
/**
 * _owner as a person with a first name, last name, birth date
 * initializes the array List as transaction
 */
private Person _owner;

private ArrayList<Transaction> _transactions;

}