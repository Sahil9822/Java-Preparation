//Name:- Sahil Pawale  Reg.No:- 20BCE10661
import java.util.*;
public class RectangleUsingStars 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers of Rows");
		int row = sc.nextInt();
		System.out.println("Enter the Numbers of Column");
		int col = sc.nextInt();
		for(int i = 1; i<=row; i++) 
		{
			for(int j = 1; j<=col; j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}