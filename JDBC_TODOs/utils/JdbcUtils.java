package it.education.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	//utility class used for establishing a Connection
	public static Connection buildConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String URL = "jdbc:mysql://localhost:3306/cdac2";
		String UID = "root";
		String PWD = "password";
		Connection dbConnection = DriverManager.getConnection(URL, UID, PWD);
		System.out.println("Connected");
		return dbConnection;
	}
}
