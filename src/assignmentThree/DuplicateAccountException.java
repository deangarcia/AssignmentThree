package assignmentThree;

public class DuplicateAccountException extends Exception
{
	public DuplicateAccountException(String exc)
	{
		super(exc);
	}
	public static int getCount()
	{
		count++;
		return count;
	}
	private static int count = 0;
}
