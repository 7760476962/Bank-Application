package com.project1.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {
	private static Connection connection;

	private PostgresConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/postgres";
		String user ="postgres";
		String password ="A143@spt";
		connection=DriverManager.getConnection(url, user, password);
		return connection;
	}

}
