import java.util.Scanner;
public interface AreaofvariousShape 
{
	public void Square();
	public void Circle();
	public void Rectangle();
	public void Triangle();
}
public class shapeArea implements AreaofvariousShape
{
	public static void main(String[] args) 
	{
		shapeArea geometry = new shapeArea();
		geometry.Circle();
		geometry.Square();
		geometry.Rectangle();
		geometry.Triangle();
	}
	public void Circle() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double r = sc.nextDouble();
		double A = 3.142*r*r;
		System.out.println("Area of Circle: " +A);
	}

	@Override
	public void Square() {
		// TODO Auto-generated method stub
		Scanner Z1 = new Scanner(System.in);
		System.out.println("Enter the side of the square");
		double a = Z1.nextDouble();
		double S = a*a;
		System.out.println("Area of Square: " +S);
	}

	@Override
	public void Rectangle() {
		// TODO Auto-generated method stub
		Scanner Z2 = new Scanner(System.in);
		System.out.println("Enter the side of the rectangle");
		double l = Z2.nextDouble();
		double b = Z2.nextDouble();
		double R = l*b;
		System.out.println("Area of Rectangle: " +R);
	}

	@Override
	public void Triangle() {
		// TODO Auto-generated method stub
		Scanner Z3 = new Scanner(System.in);
		System.out.println("Enter the side of the triangle");
		double a1 = Z3.nextDouble();
		double a2 = Z3.nextDouble();
		double T = a1*a2 / 2;
		System.out.println("Area of Triangle: " +T);
	}
}