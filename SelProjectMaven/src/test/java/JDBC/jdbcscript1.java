package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcscript1 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		String dburl="jdbc:mysql://localhost:3306/advsel";
		//path of db
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connector file path to db
		try {
			DriverManager.getConnection(dburl,"root","root");
			System.out.println("Connection established");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Connection failed");
		}
	}
}
