
public class OverdrawnAccountException extends Exception
{
	public OverdrawnAccountException(String exc)
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
