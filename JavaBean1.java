public class JavaBean1 
{
	private String name;
	private int id;
	private double salary;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	public static void main(String[] args) 
	{
		JavaBean1 employee = new JavaBean1();
		employee.setName("John Doe");
		employee.setId(1234);
		employee.setSalary(50000.0);
		
		System.out.println("Employee name: " + employee.getName());
		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Employee salary: " + employee.getSalary());
	}
}