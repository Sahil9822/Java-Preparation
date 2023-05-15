import java.util.Scanner;

public class UserInputUsingScannerClass1 
{
	public static void main(String[] args) 
	{
		String str = "";
		int i = 0;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.println("I is " +i);
	}

}
