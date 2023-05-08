
import java.util.Scanner;
public class AreaofshapesusingInterface 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double r = sc.nextDouble();
		double A = 3.142*r*r;
		System.out.println("Area of Circle: " +A);
	}
}
