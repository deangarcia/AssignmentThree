package assignmentThree;

public class OverdrawnAccountException extends Exception
{
	public OverdrawnAccountException(String exc)
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
