/**
* CECS 277 Spring 2014 Assignment 2
* @author Dean Garcia 3996
* @author Michael Valenzuela 5522
**/
package assignmentThree;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 
 * Represents any person with basic personal information
 *Basic information includes: first name, last name, and birth date
 */
public class Person

{

	/**
	 * 
	 * @param firstName first name
	 * @param lastName last name
	 * @param birthDate person's birthdate
	 */
	public Person(String firstName, String lastName, Calendar birthDate)

	{

		_firstName = firstName;

		_lastName = lastName;

		_birthDate = birthDate;

	}

	/**
	 * 
	 * @return gets person's first name
	 */
	public String getFirstName()

	{
		return _firstName;

	}

	/**
	 * gets person's last name
	 * @return this person's last name
	 */
	public String getLastName()

	{
		return _lastName;
	}

	/**
	 * 
	 * @return gets this person's birth date
	 */
	public Calendar getbirthDate()

	{
		return _birthDate;
	}

	/**
	 * person's first name as a string
	 * person's last name as a string
	 * persons Birth date as a string
	 */
	private String _firstName;

	private String _lastName;

	private Calendar _birthDate;

}
