package arithmetic;
import arithmetic.Addition;
import arithmetic.Subtraction;
import arithmetic.Multiplication;
import arithmetic.Division;

public class Main {

	public static void main(String[] args) 
	{
		int a = 10;
	    int b = 5;

	    int sum = Addition.add(a, b);
	    System.out.println("The sum of " + a + " and " + b + " is " + sum);

	    int difference = Subtraction.subtract(a, b);
	    System.out.println("The difference between " + a + " and " + b + " is " + difference);

	    int product = Multiplication.multiply(a, b);
	    System.out.println("The product of " + a + " and " + b + " is " + product);

	    try {
	      int quotient = Division.divide(a, b);
	      System.out.println("The quotient of " + a + " and " + b + " is " + quotient);
	    } catch (IllegalArgumentException e) {
	      System.out.println("Cannot divide by zero");
	    }
	}
}
