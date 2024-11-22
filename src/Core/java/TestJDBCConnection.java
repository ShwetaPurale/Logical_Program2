package Core.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException{	
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
		
	}

}
