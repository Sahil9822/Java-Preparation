import java.util.*;
public class TestThrow2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age >= 18) 
		{
			throw new ArithmeticException("The Person is eligible to vote");
		}
		else 
		{
			System.out.println("The Person is not eligible to vote");
		}
	}

}