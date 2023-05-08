public class TestFinallyBlock1 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside the try block");  
			int data=25/0;    //code throws divide by zero exception
			System.out.println(data);    
		}
		catch(NullPointerException e){  
			System.out.println(e);  
		}   
		finally {  
			System.out.println("finally block is always executed");  
		}    
		System.out.println("rest of the code...");    
	}
}