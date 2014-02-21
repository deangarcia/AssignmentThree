public class DuplicateAccountException extends Exception
{
	public DuplicateAccountException(String exc)
	{
		super(exc);
		count++;
	}
	public static int getCount()
	{
		return count;
	}
	private static int count = 0;
}
