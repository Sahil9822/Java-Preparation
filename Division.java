package arithmetic;

public class Division 
{
	public static int divide(int a, int b)
	{
		if (b == 0) 
		{
			throw new IllegalArgumentException("Cannot divide by zero");
	    }
		return a / b;
	}
}