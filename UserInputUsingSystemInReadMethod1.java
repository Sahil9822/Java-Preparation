import java.io.IOException;

public class UserInputUsingSystemInReadMethod1 {

	public static void main(String[] args) throws Exception {
		int j = System.in.read();
		System.out.println((char)j);
		String str = "";
		while((j = System.in.read())!= 48) 
		{
			str = str + (char)j;
		}
		System.out.println(str);
	}

}
