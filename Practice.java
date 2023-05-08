import javax.swing.*;

public class Practice 
{
	public static void main(String[] args) 
	{
		JFrame f= new JFrame("Title");  
	    JTextField t1;
		JButton t2;  
		JScrollBar t3;
	    t1=new JTextField("Welcome to Java World.");  
	    t1.setBounds(50,100, 200,30);
	    t2 = new JButton("Click");
	    t2.setBounds(50,150,200,30);
	    t3 = new JScrollBar();
	    t3.setBounds(300,50,30,200);
	    f.add(t1);
	    f.add(t2);
	    f.add(t3);
	    f.setSize(350,350);  
	    f.setLayout(null);  
	    f.setVisible(true);
	}
}