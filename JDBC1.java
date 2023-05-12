package DB;

import java.sql.*;

public class JDBC1 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con;
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Fuel","root","");
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM Fuel");
		String insertSql = "INSERT INTO Fuel (Petrol, Disel, CNG) VALUES (109, 100, 95)";
	    int rowsAffected = statement.executeUpdate(insertSql);
	    System.out.println("Rows affected: " + rowsAffected);
        con.close();
	}
}