//Name:- Sahil Pawale  Reg.No:- 20BCE10661
import java.util.*;
class Circle {
    double radius;
    
    public double getArea() 
    {
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter() 
    {
        return 2 * Math.PI * radius;
    }
}
public class AreaandPerimeterofCircle 
{
	public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        
        System.out.print("Enter the radius of the circle: ");
        circle.radius = input.nextDouble();
        
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();
        
        System.out.println("Area of the circle is: " + area);
        System.out.println("Perimeter of the circle is: " + perimeter);
    }
}