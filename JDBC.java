package DB;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con;
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Fuel","root","");
		Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Fuel");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("Petrol")+" "+resultSet.getString("Disel"));
        }
        con.close();
        statement.close();
	}
} 
