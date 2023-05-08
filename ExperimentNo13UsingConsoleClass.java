import java.io.Console;

public class ExperimentNo13UsingConsoleClass 
{
	public static void main(String[] args) 
	{
        Console console = System.console();
        System.out.print("Enter your name: ");
        String name = console.readLine();
        System.out.println("Hello " + name);
    }

}