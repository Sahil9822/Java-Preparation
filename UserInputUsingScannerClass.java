import java.util.Scanner;

public class UserInputUsingScannerClass 
{

	public static void main(String[] args) 
	{
		String str = "";
		int i = 0;
		Scanner sc = new Scanner(System.in);
		i = Integer.parseInt(sc.nextLine());
		System.out.println("I is " +i);
	}

}
