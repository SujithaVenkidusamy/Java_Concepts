package sqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlbuilder {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register your driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish a Database Connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sujitha","root","");
		System.out.print("Connection Created");
	}
}
